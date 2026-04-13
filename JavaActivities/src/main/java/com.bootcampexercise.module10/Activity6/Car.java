package com.bootcampexercise.module10.Activity6;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}
