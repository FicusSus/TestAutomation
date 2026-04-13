package com.bootcampexercise.module10.Activity2;

public class AbstractActivity {

    public static void main(String[] args) {

        // Employee object
        Employee emp = new Employee("John", 30, "Developer", "Google", 80000);
        emp.introduce();  // 2.3.1

        System.out.println();

        // Student object
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        student.setSchoolName("Harvard");

        student.introduce();  // 2.3.2
    }
}
