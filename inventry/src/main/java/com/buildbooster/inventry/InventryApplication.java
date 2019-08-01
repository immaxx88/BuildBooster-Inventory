package com.buildbooster.inventry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class InventryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventryApplication.class, args);
	}

}
