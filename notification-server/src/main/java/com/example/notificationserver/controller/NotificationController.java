package com.example.notificationserver.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.jms.Message;
import javax.jms.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping
public class NotificationController {

    @Autowired
    private JavaMailSender emailSender;
    @JmsListener(destination =   "email-event")
    public void listener(String message){
        try {
            ObjectMapper mapper = new ObjectMapper();
            Message messageObject = mapper.readValue(message,Message.class);
            SimpleMailMessage messageSend = new SimpleMailMessage();
            messageSend.setTo();
        }
    }
}
