package com.zjgsu.iee.beans.spel;

public class Car {
	private String brand;
	
	private double price;
	
	private double typePerimeter;

	public double getTypePerimeter() {
		return typePerimeter;
	}

	public void setTypePerimeter(double typePerimeter) {
		this.typePerimeter = typePerimeter;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", typePerimeter=" + typePerimeter + "]";
	}

	public Car() {
		System.out.println("Car's Constructor....");
	}
	
	
	
	
}
