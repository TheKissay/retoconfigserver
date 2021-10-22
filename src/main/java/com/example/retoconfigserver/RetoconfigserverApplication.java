package com.example.retoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class RetoconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoconfigserverApplication.class, args);
	}

}
