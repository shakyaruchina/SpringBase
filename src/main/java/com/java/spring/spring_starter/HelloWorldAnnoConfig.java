package com.java.spring.spring_starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldAnnoConfig {
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
