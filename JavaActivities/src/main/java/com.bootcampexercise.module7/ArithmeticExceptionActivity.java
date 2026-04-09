package com.bootcampexercise.module7;

public class ArithmeticExceptionActivity {

    // 1 - main method
    public static void main(String[] args) {
        // 2 - Create instance and call catchMe
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();

        System.out.println("Calling catchMe with 10 and 0:");
        obj.catchMe(10, 0);  // This will trigger ArithmeticException

        System.out.println("\nCalling catchMe with 10 and 2:");
        obj.catchMe(10, 2);  // This will execute normally
    }

    void catchMe(int num1, int num2) {
        try {
            // This will throw ArithmeticException if num2 is 0
            int result = num1 / num2;
            System.out.println("Result of " + num1 + " / " + num2 + " = " + result);

        } catch (ArithmeticException a) {
            System.out.println("Cannot divide by zero! Please provide a non-zero denominator.");

        } finally {
            // 4 - Always executes
            System.out.println("Thank you for using this program.");
        }
    }
}
