package com.springbokka.DemoSpring;

public class Dev {

	Laptop laptop;
	int age;

	
	public Dev(Laptop laptop) {
		this.laptop = laptop;
	}

	public Dev(Laptop laptop, int age) {
		this.laptop = laptop;
		this.age = age;
	}

	// Getter and setters are required for SETTER INJECTION for non primitive variables
	// public Laptop getLaptop() {
	// 	return laptop;
	// }

	// public void setLaptop(Laptop laptop) {
	// 	this.laptop = laptop;
	// }

	public void build() {
		if (age > 0) {
			System.out.println("Age of Dev is "+age);
		}
		System.out.println("Building new project!");
	}
}