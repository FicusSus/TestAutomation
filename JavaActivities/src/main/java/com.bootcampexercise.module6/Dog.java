package com.bootcampexercise.module6;

public class Dog implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Dog says: 'Woof Woof'!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}
