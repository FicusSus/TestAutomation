package com.bootcampexercise.module6;

public class AnimalActivity {
    public static void main(String[] args) {

        // Declare identifiers using interface
        Animal cat = new Cat();
        Animal dog = new Dog();

        Mammal mammal = new Mammal("Tommy");

        // Set animal to cat
        mammal.setAnimal(cat);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();

        // Set animal to dog
        mammal.setAnimal(dog);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}