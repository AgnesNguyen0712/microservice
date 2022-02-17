package com.example.notificationserver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class Listener {

    @JmsListener(destination = "email-event")
    public void receiveMessage(final String jsonMessage) throws JMSException {
        System.out.println("Received message " + jsonMessage);
    }
}
