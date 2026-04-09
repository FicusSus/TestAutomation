package com.bootcampexercise.module7;

// 1 - extend Exception class
public class CustomExceptionActivity extends Exception {

    // 2 - override getMessage()
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}
