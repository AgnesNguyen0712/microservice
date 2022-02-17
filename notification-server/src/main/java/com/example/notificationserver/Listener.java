package com.example.notificationserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class Listener {

    @Autowired
    private JavaMailSender emailSender;

    @JmsListener(destination = "email-event")
    public void receiveMessage(final String jsonMessage) throws JMSException {
        System.out.println("Received message " + jsonMessage);
        SimpleMailMessage messageSend = new SimpleMailMessage();
        messageSend.setFrom("ntthuthao0712@gmail.com");
        messageSend.setTo("nthithuthao@tma.com.vn");
        messageSend.setSubject("Order Information");
        messageSend.setText("Sended order "+ "1");
        emailSender.send(messageSend);

    }
}
