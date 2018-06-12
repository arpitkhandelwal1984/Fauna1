package com.singtel.fauna;

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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A unit test case for the Solution class
 * Created by Arpit Khandelwal.
 */
public class SolutionTest {
    private Animal[] animals;

    @Before
    public void prepareTestData(){
        Mammal cat = new Cat(); //walk
        Mammal dog = new Dog(); //walk
        Fish clownFish = new Clownfish(); //swim
        Fish shark = new Shark(); //swim
        Bird duck = new Duck(); //swim, fly
        Bird chicken = new Chicken(Chicken.ChickenType.FEMALE); //sing
        Bird rooster = new Chicken(Chicken.ChickenType.MALE); //sing
        Bird parrot = new Parrot(); //sing, fly
        Animal dolphin = new Dolphin(); //swim
        Animal butterfly = new Butterfly(); //fly

        animals = new Animal[]{
                cat,dog,clownFish,shark,duck,chicken,rooster,parrot,dolphin,butterfly
        };
    }

    @Test
    public void testAnalyseSwimmers() {
        Assert.assertEquals("There must be 4 Swimmers!",4, Solution.analyseSwimmers(animals));
    }

    @Test
    public void negativeTestAnalyseSwimmers() {
        Assert.assertNotEquals(3, Solution.analyseSwimmers(animals));
    }

    @Test
    public void testAnalyseWalkers() {
        Assert.assertEquals("There must be 2 Walkers!",2, Solution.analyseWalkers(animals));
    }

    @Test
    public void negativeTestAnalyseWalkers() {
        Assert.assertNotEquals(1, Solution.analyseWalkers(animals));
    }

    @Test
    public void testAnalyseFliers() {
        Assert.assertEquals("There must be 3 Fliers!",3, Solution.analyseFliers(animals));
    }

    @Test
    public void negativeTestAnalyseFliers() {
        Assert.assertNotEquals(4, Solution.analyseFliers(animals));
    }

    @Test
    public void testAnalyseSingers() {
        Assert.assertEquals("There must be 4 Singers!",4, Solution.analyseSingers(animals));
    }

    @Test
    public void negativeTestAnalyseSingers() {
        Assert.assertNotEquals(1, Solution.analyseSingers(animals));
    }
}
