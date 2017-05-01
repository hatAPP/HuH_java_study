package com.zjgsu.iee.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjgsu.iee.beans.autowire.Address;
import com.zjgsu.iee.beans.autowire.Person;
import com.zjgsu.iee.beans.collection.DataSourse;

public class Main {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-properties.xml");
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
}
