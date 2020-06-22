package com.java.spring.spring_starter;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.*;
/**
 * Hello world!
 *Using XML configuration
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	/** XML Configuartion
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    	obj.getMessage();
    	
    	**/
    	
    	//Annotation Configuration
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldAnnoConfig.class);
    	
    	HelloWorld helloWorld = context.getBean(HelloWorld.class);
    	helloWorld.setMessage("Hello World!");
    	helloWorld.getMessage();
    }
}
