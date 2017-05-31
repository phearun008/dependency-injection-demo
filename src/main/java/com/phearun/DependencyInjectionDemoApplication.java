package com.phearun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		
		/*Drawing d1 = context.getBean("drawing", Drawing.class);
		d1.drawShape();*/
		
		
		//TODO: Bean Scope Demo
		Drawing d2 = context.getBean("drawing", Drawing.class);
		d2.setName("Circle");
		
		Drawing d3 = context.getBean("drawing", Drawing.class);
		System.out.println(d2.getName());
		System.out.println(d3.getName());
		
	}
}
