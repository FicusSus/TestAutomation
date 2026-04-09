package com.bootcampexercise.module3;

public class Calculator {

    public static final String CALC_TYPE_BASIC = "Basic";

    private final String calcType;

    // Constructor
    public Calculator(String type) {
        this.calcType = type;
    }

    public String getCalculatorType() {
        return calcType;
    }

    // Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply numbers in an array
    public int multiply(int[] numbers) {
        int product = 1;
        for (int n : numbers) {
            product *= n;
        }
        return product;
    }

    // Divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}
