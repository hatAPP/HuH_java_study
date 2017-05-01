package com.zjgsu.iee.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("zjgsu");*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*HelloWorld helloworld = (HelloWorld) ctx.getBean("helloWorld");
		helloworld.hello();*/
		Car car=ctx.getBean(Car.class);
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person2");
		System.out.println(person);
	}
}
