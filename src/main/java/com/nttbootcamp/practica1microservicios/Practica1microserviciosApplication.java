package com.nttbootcamp.practica1microservicios;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Practica1microserviciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practica1microserviciosApplication.class, args);
	}

}
