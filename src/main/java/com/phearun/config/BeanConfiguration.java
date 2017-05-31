package com.phearun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.phearun.shape.Circle;
import com.phearun.shape.Triangle;

@Configuration
public class BeanConfiguration {

	@Bean(name="circle")
	public Circle circle(){
		return new Circle();
	}
	
	@Bean(name="triangle")
	public Triangle triangle(){
		return new Triangle();
	}
	
	/*@Bean
	public Drawing drawing(){
		Drawing drawing = new Drawing();
		drawing.setShape(new Circle());
		return drawing;
	}*/
	
}
