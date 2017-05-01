package com.zjgsu.iee.beans;

public class Car {
	private String brand;
	private String corp;
	
	private int price;
	private int maxSpeed;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}

	public Car(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	
	
}
