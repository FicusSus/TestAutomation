package com.bootcampexercise.module10.Activity3;

public class Calculator {

    // 3.1.1 Method overloading (add)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // 3.1.2 Subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    // 3.1.3 Divide with try-catch
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    // 3.1.4 Multiply with custom exception
    public int multiply(int a, int b) {
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers not allowed");
            }
            return a * b;
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
