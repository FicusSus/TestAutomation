package com.bootcampexercise.module6;

public class Mammal {
    private Animal myAnimal;
    private final String name;

    // Constructor
    public Mammal(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {
        System.out.print("Animal with name: " + name + " is ... ");
        myAnimal.sleep();
    }

    public void animalIsSpeaking() {
        System.out.print("Animal with name: " + name + " is ... ");
        myAnimal.animalSound();
    }
}
