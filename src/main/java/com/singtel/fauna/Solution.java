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
import com.singtel.fauna.insect.Butterfly;
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
        Animal butterfly = new Butterfly();

        Animal[] animals = new Animal[]{
                cat,dog,clownFish,shark,duck,chicken,rooster,parrot,dolphin,butterfly
        };
        int fliers = analyseFliers(animals);
        int swimmers = analyseSwimmers(animals);
        int singers = analyseSingers(animals);
        int walkers = analyseWalkers(animals);

        System.out.println("Number of Animals that can Fly = " + fliers + "\n " +
                "Number of Animals that can Walk = " + walkers + "\n " +
                "Number of Animals that can Sing = " + singers + "\n " +
                "Number of Animals that can Swim = " + swimmers);


        //unifiedAnalysis(animals);
    }

    /**
     * Analyse the flying animals
     * @param animals
     * @return
     */
    public static int analyseFliers(Animal[] animals) {
        int canFly = 0;
        for (Animal animal:animals) {
            if(animal instanceof ICanFly){
                canFly++;
            }
        }
        return canFly;
    }

    /**
     * Analyse the swimmers
     * @param animals
     * @return
     */
    public static int analyseSwimmers(Animal[] animals) {
        int canSwim = 0;
        for (Animal animal:animals) {
            if(animal instanceof ICanSwim){
                canSwim++;
            }
        }
        return canSwim;
    }

    /**
     * Analyse the singers
     * @param animals
     * @return
     */
    public static int analyseSingers(Animal[] animals) {
        int canSing = 0;
        for (Animal animal:animals) {
            if(animal instanceof ICanSing) {
                canSing++;
            }
        }
        return canSing;
    }

    /**
     * Analyse the walkers
     * @param animals
     * @return
     */
    public static int analyseWalkers(Animal[] animals) {
        int canWalk = 0;
        for (Animal animal:animals) {
            if(animal instanceof ICanWalk){
                canWalk++;
            }
        }
        return canWalk;
    }

    /**
     * Analyse all the behaviours in single go
     * @param animals
     */
    private static void unifiedAnalysis(Animal[] animals){
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
