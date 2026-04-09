package com.bootcampexercise.module5;

public class InheritanceActivityTemp {
    public static void main(String[] args) {

        // Create Person object and set name and age
        Person_I myPerson = new Person_I();
        myPerson.setName("Sarah Johnson");
        myPerson.setAge(21);

        System.out.println("-----------------------------");

        // Create Employee object and set attributes
        Employee_I myEmployee = new Employee_I();
        myEmployee.setName("Shawn Cun");
        myEmployee.setAge(32);
        myEmployee.setTitle("Developer");
        myEmployee.setSalary(70000.00);

        // Print Info using Employee object
        System.out.println("Employee Info:");
        System.out.println("Name: " + myEmployee.getName());
        System.out.println("Age: " + myEmployee.getAge());
        System.out.println("Title: " + myEmployee.getTitle());
        System.out.println("Salary: " + myEmployee.getSalary());

        System.out.println("-----------------------------");

        // Print Info using Person object
        System.out.println("Person Info:");
        System.out.println("Name: " + myPerson.getName());
        System.out.println("Age: " + myPerson.getAge());

        System.out.println("-----------------------------");
    }
}
