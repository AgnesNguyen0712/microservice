package com.example.OrderServer.controller;

import com.example.OrderServer.entity.Catalog;
import com.example.OrderServer.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.jms.Queue;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class CatalogController {
    @Autowired
    private CatalogRepository catalogRepository;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private Queue queue;
    @Autowired
    private  JmsTemplate jmsTemplate;

    @GetMapping("order/allCatalog")
    public List<Catalog> getAllCatalog(){
        List<Catalog> _catalogs = new ArrayList<>();
        _catalogs = restTemplate.getForObject("http://localhost:9080/item/allCatalog",List.class);
        String message = "{\n"+ "\"email\":\"ntthuthao0712@gmail.com\",\n"+"\"orderId\": "+"1"+"}";
        jmsTemplate.convertAndSend(queue,message);
        return  _catalogs;
    }
}
