package com.bootcampexercise.module5;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        radius = 1.0; // default radius
    }

    public void setRadius(double r) {
        radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}