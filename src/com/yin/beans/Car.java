package com.yin.beans;

public class Car extends Vehicle {
	
	public Car() {
		drivable = new DefalutDrivable();
	}

	public void drive() {
		drivable.drive();
	}
	@Override
	public void honk() {
		System.out.println("car honk");

	}

}
