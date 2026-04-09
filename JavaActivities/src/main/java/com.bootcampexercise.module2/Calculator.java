package com.bootcampexercise.module2;

public class Calculator {

    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        System.out.println("Sum: " + sum(a, b));
        System.out.println("Subtract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));
        System.out.println("Modulo: " + modulo(a, b));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int modulo(int x, int y) {
        return x % y;
    }
}
