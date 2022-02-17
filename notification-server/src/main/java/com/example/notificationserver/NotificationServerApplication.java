package com.example.notificationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableEurekaClient
@EnableJms
public class NotificationServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(NotificationServerApplication.class, args);
	}
}
