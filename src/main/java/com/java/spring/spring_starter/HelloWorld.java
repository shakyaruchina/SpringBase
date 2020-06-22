package com.java.spring.spring_starter;

import org.springframework.context.annotation.Configuration;

//Annotations @..
@Configuration
public class HelloWorld {
	
	

	
	 //XML configuration
	//Annotation configuration
	  private String message;

	

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your message : " + message);
	}
	
	

}
