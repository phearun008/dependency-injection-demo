package com.phearun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.phearun.shape.Shape;

@Configuration
//@Scope(scopeName="prototype")
public class Drawing {
	
	private Shape shape;
	
	@Autowired
	@Qualifier("circle")
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	/*public Drawing(Shape shape){
		this.shape = shape;
	}*/
	
	public void drawShape(){
		this.shape.draw();
	}
	
	//for bean scope demo
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
