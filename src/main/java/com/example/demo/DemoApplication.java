package com.example.demo;

import org.apache.camel.model.RouteDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		MyRoute route = new MyRoute();

		route.from("http://www.google.com");
	}

}
