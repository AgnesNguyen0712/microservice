package com.example.notificationserver.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Message {
    @Id
    private String id;
    private String email;
    private String orderId;

    public Message(String id, String email, String orderId) {
        this.id = id;
        this.email = email;
        this.orderId = orderId;
    }

    public String getEmail() {
        return email;
    }

    public String getOrderId() {
        return orderId;
    }
}
