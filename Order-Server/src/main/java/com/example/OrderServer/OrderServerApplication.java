package com.example.OrderServer;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.web.client.RestTemplate;

import javax.jms.Queue;

@SpringBootApplication
@EnableEurekaClient
@EnableJms
public class OrderServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServerApplication.class, args);
	}

}

@Configuration
class RestTemplateConfig {

	// Create a bean for restTemplate to call services
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

@Configuration
@EnableJms
class JmsConfiguration {
	@Bean
	public Queue queue(){
		return new ActiveMQQueue("email-event");
	}
}

