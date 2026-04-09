package com.bootcampexercise.module7;

public class TryCatchFinallyActivity {

    public static void main(String[] args) {
        // Call the method
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            // Intentionally use i <= 10 to trigger IndexOutOfBoundsException
            for (int i = 0; i <= 10; i++) {
                System.out.println("Array element at index " + i + " is " + arr[i]);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Oops! You tried to access an index outside the array bounds.");

        } finally {
            System.out.println("This message is printed whether or not an error occurred.");
        }
    }
}