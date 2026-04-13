package com.bootcampexercise.module10.Activity2;

import com.bootcampexercise.module10.Person;

public class Student extends Person {

    // 2.2.1 Attribute
    private String schoolName;

    // 2.2.2 Getter and Setter
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // 2.2.4 Override introduce method
    @Override
    public void introduce() {
        System.out.println("I am study in university " + schoolName);
    }
}
