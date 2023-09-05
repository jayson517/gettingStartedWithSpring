package com.example.gettingstartedwithspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		var name = context.getBean("address");
//		System.out.println(name);
		System.out.println(name);
		
	}

}
