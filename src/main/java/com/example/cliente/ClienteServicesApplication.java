package com.example.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClienteServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteServicesApplication.class, args);
	}

}
