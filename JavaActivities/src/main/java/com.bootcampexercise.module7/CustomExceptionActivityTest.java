package com.bootcampexercise.module7;

public class CustomExceptionActivityTest {

    // 1 - main method
    public static void main(String[] args) {

        CustomExceptionActivityTest test = new CustomExceptionActivityTest();

        try {
            test.validateUser("John");   // valid user
            test.validateUser("David");  // invalid user
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    // validateUser throws CustomExceptionActivity if user is invalid
    void validateUser(String name) throws CustomExceptionActivity {

        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        int flag = 0;

        // 2 - check if name is in validUsers array
        for (String validUser : validUsers) {
            if (validUser.equals(name)) {
                flag = 1;
                break;
            }
        }

        // 3 - if flag is 0, throw exception
        if (flag == 0) {
            throw new CustomExceptionActivity();
        }
        // 4 - if flag is 1, print welcome message
        else {
            System.out.println("Welcome to Payroll program, " + name + "!");
        }
    }
}
