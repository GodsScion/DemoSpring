package com.springbokka.DemoSpring;

public class Dev {

	Laptop laptop;
	int age;

	// Getter and setters are required for SETTER INJECTION
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void build() {
		System.out.println("Building new project");
	}
}