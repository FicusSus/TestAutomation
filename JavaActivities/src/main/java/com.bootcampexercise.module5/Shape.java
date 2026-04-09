package com.bootcampexercise.module5;

public abstract class Shape {
    public String color;

    public Shape() {
    }

    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Setters and getters for color
    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}
