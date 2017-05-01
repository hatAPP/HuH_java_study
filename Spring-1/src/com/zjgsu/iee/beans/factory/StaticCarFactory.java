package com.zjgsu.iee.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	private static Map<String, Car> cars = new HashMap<>();
	
	static{
		cars.put("audi", new Car("audi",30000000));
		cars.put("Ford", new Car("Ford",40000000));
	}
	
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
