package com.yin.beans;

public class Flight extends Vehicle {

	public Flight() {
		flyable = new DefaultFlyable();
	}
	
	public void fly() {
		flyable.fly();
	}
	@Override
	public void honk() {
		System.out.println("Flight honk");
		
	}
	
}
