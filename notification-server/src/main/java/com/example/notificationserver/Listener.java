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
	    public JavaMailSender emailSender;
    @JmsListener(destination = "email-event")
    public void receiveMessage(final String jsonMessage) throws JMSException {
        System.out.println("Received message " + jsonMessage);
        // Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("ntthuthao0712@gmail.com");
        message.setSubject("Order infor");
        message.setText(jsonMessage);
        // Send Message!
        this.emailSender.send(message);
    }
}
