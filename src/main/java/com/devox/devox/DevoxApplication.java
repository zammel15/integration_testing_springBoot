package com.devox.devox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.devox.devox", "com.devox.web", })

@SpringBootApplication
public class DevoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevoxApplication.class, args);
	}
}
