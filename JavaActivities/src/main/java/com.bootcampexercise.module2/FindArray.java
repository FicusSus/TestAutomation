package com.bootcampexercise.module2;

public class FindArray {
    public static void main(String[] args) {

        int[] numbers = {
                5, 12, 7, 99, 23, 54, 3, 88, 45, 16,
                78, 2, 30, 67, 90, 11, 4, 81, 55, 1
        };

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println(largest);
    }
}
