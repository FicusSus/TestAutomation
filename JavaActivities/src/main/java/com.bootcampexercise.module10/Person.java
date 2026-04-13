package com.bootcampexercise.module10;

public abstract class Person {

    // 1.1 Attributes
    private String name;
    private int age;

    // 1.2 Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 1.3 Introduce method
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}