package com.singtel.fauna;

import com.singtel.fauna.behaviour.ICanFly;
import com.singtel.fauna.behaviour.ICanSing;
import com.singtel.fauna.behaviour.ICanSwim;
import com.singtel.fauna.behaviour.ICanWalk;
import com.singtel.fauna.bird.Bird;
import com.singtel.fauna.bird.Chicken;
import com.singtel.fauna.bird.Duck;
import com.singtel.fauna.bird.Parrot;
import com.singtel.fauna.fish.Clownfish;
import com.singtel.fauna.fish.Dolphin;
import com.singtel.fauna.fish.Fish;
import com.singtel.fauna.fish.Shark;
import com.singtel.fauna.mammals.Cat;
import com.singtel.fauna.mammals.Dog;
import com.singtel.fauna.mammals.Mammal;

import java.util.Locale;

/**
 * Created by Arpit Khandelwal.
 */
public class Solution {
    public static void main(String[] args) {

        Mammal cat = new Cat();
        Mammal dog = new Dog();

        Fish clownFish = new Clownfish();
        ((Clownfish)clownFish).makeAJoke();
        Fish shark = new Shark();
        ((Shark)shark).eat(clownFish);

        Bird duck = new Duck();
        Bird chicken = new Chicken(Chicken.ChickenType.FEMALE);
        chicken.say();
        Bird rooster = new Chicken(Chicken.ChickenType.MALE);
        rooster.say();
        Bird parrot = new Parrot();
        ((Parrot)parrot).setNeighbour(cat);

        Animal dolphin = new Dolphin();

        Animal[] animals = new Animal[]{
                cat,dog,clownFish,shark,duck,chicken,rooster,parrot,dolphin
        };
        analyse(animals);
    }

    private static void analyse(Animal[] animals){
        int canFly = 0;
        int canWalk = 0;
        int canSing = 0;
        int canSwim = 0;
        for (Animal animal:animals) {
            if(animal instanceof ICanFly){
                canFly++;
            }
            if(animal instanceof ICanWalk){
                canWalk++;
            }
            if(animal instanceof ICanSing){
                canSing++;
            }
            if(animal instanceof ICanSwim){
                canSwim++;
            }
        }

        System.out.println("Number of Animals that can Fly = " + canFly + "\n " +
                           "Number of Animals that can Walk = " + canWalk + "\n " +
                           "Number of Animals that can Sing = " + canSing + "\n " +
                           "Number of Animals that can Swim = " + canSwim);
    }
}
