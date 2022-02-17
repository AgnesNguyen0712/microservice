package com.example.notificationserver.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private JavaMailSender emailSender;

//    public void listener(String message){
//        System.out.println("notification"+message);
//        SimpleMailMessage messageSend = new SimpleMailMessage();
//        messageSend.setTo("nthithuthao@tma.com.vn");
//        messageSend.setSubject("Order Information");
//        messageSend.setText("Sended order "+ "1");
//        emailSender.send(messageSend);
//    }
}
