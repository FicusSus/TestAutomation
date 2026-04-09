package com.bootcampexercise.module2;

public class FindLargest {
    public static void main(String[] args) {
        int x = 10;
        int y = 88;
        int z = 2;

        int largest = x;

        if (y > largest) {
            largest = y;
        }

        if (z > largest) {
            largest = z;
        }

        System.out.println("Largest number is: " + largest);
    }
}