package com.bootcampexercise.module3;

public class CarInstance {
    public static void main(String[] args) {
        // Only 1 car instance
        Car car1 = new Car();
        car1.name = "Toyota";
        car1.color = "Red";
        car1.modelNo = 2022;

        // Print only name
        System.out.println("Car name: " + car1.name);

        // Print all 3 attributes
        System.out.println("Car Details: Name: " + car1.name + ", Color: " + car1.color + ", Model No: " + car1.modelNo);
    }
}