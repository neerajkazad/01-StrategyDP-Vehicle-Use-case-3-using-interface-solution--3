package com.yin.beans;

public class AudiRS7 extends Vehicle {

	public AudiRS7() {
		drivable = new AutomaticDrivable();
	}
	
	public void drive() {
		drivable.drive();
	}

	@Override
	public void honk() {
		System.out.println("AudiRS7 honk");

	}

}
