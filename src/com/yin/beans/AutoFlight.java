package com.yin.beans;

public class AutoFlight extends Vehicle {

	public AutoFlight() {
		flyable = new AutomaticFlyable();
	}

	public void fly() {
		flyable.fly();
	}

	@Override
	public void honk() {
		System.out.println("AutomaticFlight honk");

	}

}
