package com.singtel.fauna;

/**
 * Created by Arpit Khandelwal.
 */
public class Solution {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Bird duck = new Duck();
        duck.sing();
        duck.fly();
        duck.swim();

        Bird chicken = new Chicken(Chicken.ChickenType.MALE);
        chicken.sing();
        chicken.fly();
        chicken.swim();

        Parrot parraot1 = new Parrot();
        parraot1.setNeighbour(dog);
        parraot1.sing();
        parraot1.fly();
        parraot1.swim();

        Parrot parraot2 = new Parrot();
        parraot2.setNeighbour(cat);
        parraot2.sing();
        parraot2.fly();
        parraot2.swim();

        Parrot parraot3 = new Parrot();
        parraot3.setNeighbour(chicken);
        parraot3.sing();
        parraot3.fly();
        parraot3.swim();

    }
}
