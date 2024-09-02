package com.springbokka.DemoSpring;

public class Dev {

	Computer computer;
	int age;
	
	public Dev(Computer computer) {
		this.computer = computer;
	}

	public Dev(Computer computer, int age) {
		this.computer = computer;
		this.age = age;
	}

	public void build() {
		if (age > 0) {
			System.out.println("Age of Dev is "+age);
		}
		System.out.println("Building new project!");
		computer.compile();
	}
}