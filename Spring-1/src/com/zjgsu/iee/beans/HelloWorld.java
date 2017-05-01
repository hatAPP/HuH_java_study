package com.zjgsu.iee.beans;


public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public HelloWorld() {
		
	}

	public void hello(){
		System.out.println("hello"+name);		
	}
	
	
}
