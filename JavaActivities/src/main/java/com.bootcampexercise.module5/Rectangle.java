package com.bootcampexercise.module5;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        length = 2.0; // default length
        width = 1.0;  // default width
    }

    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
