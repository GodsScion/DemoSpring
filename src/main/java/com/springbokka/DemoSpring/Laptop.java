package com.springbokka.DemoSpring;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop is assigned");
    }

    public void compile() {
        System.out.println("Laptop is compiling!");
    }
}
