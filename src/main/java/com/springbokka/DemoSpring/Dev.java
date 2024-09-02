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

	// Getter and setters are required for SETTER INJECTION
	// public Laptop getLaptop() {
	// 	return laptop;
	// }
	// public void setLaptop(Laptop laptop) {
	// 	this.laptop = laptop;
	// }

	// public int getAge() {
	// 	return age;
	// }
	// public void setAge(int age) {
	// 	this.age = age;
	// }

	public void build() {
		if (age > 0) {
			System.out.println("Age of Dev is "+age);
		}
		System.out.println("Building new project!");
	}
}