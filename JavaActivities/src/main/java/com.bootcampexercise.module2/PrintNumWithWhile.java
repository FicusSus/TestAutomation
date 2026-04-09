package com.bootcampexercise.module2;

public class PrintNumWithWhile {
    public static void main(String[] args) {

        int num = 1; // start from the first odd number

        while (num < 100) {
            System.out.println(num);
            num = num + 2; // go to the next odd number
        }
    }
}