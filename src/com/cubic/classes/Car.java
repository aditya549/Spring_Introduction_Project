package com.cubic.classes;

public class Car {
	private String carname;
	private Engine engine;
	
	public Car(String carname, Engine engine) {
		this.carname = carname;
		this.engine = engine;
	}
	public void printcarname() {
		System.out.println(carname);
		System.out.println(engine.getModelYear());
	}
	public void display() {
		System.out.println("Display Method");
	}
	
}
