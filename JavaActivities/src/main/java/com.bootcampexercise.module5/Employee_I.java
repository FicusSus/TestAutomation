package com.bootcampexercise.module5;

public class Employee_I extends Person_I {
    private String title;
    private double salary;

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }
}
