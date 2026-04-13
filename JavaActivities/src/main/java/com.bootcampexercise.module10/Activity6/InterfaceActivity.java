package com.bootcampexercise.module10.Activity6;

public class InterfaceActivity {

    public static void main(String[] args) {

        // 6.4.2 Call bike methods
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println();

        // 6.4.3 Call car methods
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
