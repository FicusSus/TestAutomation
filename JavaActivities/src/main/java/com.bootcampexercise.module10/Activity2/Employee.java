package com.bootcampexercise.module10.Activity2;

import com.bootcampexercise.module10.Person;
import java.util.List;

public class Employee extends Person {

    // 2.1.2 Attributes
    private String jobTitle;
    private String company;
    private double salary;

    // 2.1.3 Default constructor
    public Employee() {
    }

    // Constructor with parameters
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    // 2.1.4 Getters and Setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 2.1.5 Override introduce method
    @Override
    public void introduce() {
        System.out.println(
                "My name is " + getName() + " and I am " + getAge() + " years old.\n" +
                        "I am work as " + jobTitle + " in " + company + " and my salary is " + salary
        );
    }

    public static String getHighestPaidEmp(List<Employee> empList) {

        Employee highest = empList.getFirst();

        for (Employee e : empList) {
            if (e.getSalary() > highest.getSalary()) {
                highest = e;
            }
        }

        return highest.getName();
    }
}
