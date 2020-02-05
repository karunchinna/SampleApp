package com.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sample")
public class SpringBootSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleAppApplication.class, args);
	}

}
