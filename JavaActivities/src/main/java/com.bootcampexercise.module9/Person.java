package com.bootcampexercise.module9;

public class Person {

    private int weight;     // in kg
    private float height;   // in meters

    // ---------- Getters & Setters ----------
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    // ---------- BMI CALCULATION ----------
    public String calculateBMI(float height, int weight) {

        // Check for invalid values
        if (height <= 0 || weight <= 0) {
            return "Invalid values: height and weight must be greater than 0.";
        }

        if (height > 3.0f) {
            return "Invalid height: value too high.";
        }

        if (weight > 500) {
            return "Invalid weight: value too high.";
        }

        // BMI formula
        float bmi = weight / (height * height);

        // Return BMI result as string
        return "BMI is: " + bmi;
    }
}