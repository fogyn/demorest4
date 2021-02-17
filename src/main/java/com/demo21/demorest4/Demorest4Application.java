package com.demo21.demorest4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Demorest4Application {

	public static void main(String[] args) {
		SpringApplication.run(Demorest4Application.class, args);
	}

}
