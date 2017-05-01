package com.zjgus.iee.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");

		 Car car = (Car) ctx.getBean("car");
		//Car car = null;
		 System.out.println(car);
		 
		 ctx.close();

	}
}
