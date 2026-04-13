package com.bootcampexercise.module10.Activity6;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting with a kick start.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}
