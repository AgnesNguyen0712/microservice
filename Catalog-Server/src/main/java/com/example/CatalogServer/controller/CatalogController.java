package com.example.CatalogServer.controller;

import com.example.CatalogServer.entity.Catalog;
import com.example.CatalogServer.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class CatalogController {
    @Autowired
    private CatalogRepository catalogRepository;

    @GetMapping("item/allCatalog")
    public List<Catalog> getAllCatalog(){
        List<Catalog> _catalogs = new ArrayList<>();
        _catalogs.add(new Catalog(1,"Ao thun","100"));
        return  _catalogs;
    }
}
