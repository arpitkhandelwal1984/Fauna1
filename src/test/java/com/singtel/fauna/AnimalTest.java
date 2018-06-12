package com.singtel.fauna;

import com.singtel.fauna.behaviour.ICanFly;
import com.singtel.fauna.behaviour.ICanSing;
import com.singtel.fauna.behaviour.ICanSwim;
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
 * A unit test class for testing the various attributes of Animals
 * Created by Arpit Khandelwal.
 */
public class AnimalTest {
    private Animal cat,dog,clownFish,shark,duck,chicken,rooster,parrot,dolphin,butterfly;

    @Before
    public void prepareTestData(){
        cat = new Cat(); //walk
        dog = new Dog(); //walk
        clownFish = new Clownfish(); //swim
        shark = new Shark(); //swim
        duck = new Duck(); //swim, fly
        chicken = new Chicken(Chicken.ChickenType.FEMALE); //sing
        rooster = new Chicken(Chicken.ChickenType.MALE); //sing
        parrot = new Parrot(); //sing, fly
        dolphin = new Dolphin(); //swim
        butterfly = new Butterfly(); //fly
    }

    @Test
    public void testCatAncestry(){
        Assert.assertTrue("Cat is an Animal", cat instanceof Animal);
    }

    @Test
    public void testDucksCanSwim(){
        Assert.assertTrue("A Duck can swim!", duck instanceof ICanSwim);
    }

    @Test
    public void testChickensCantFly(){
        Assert.assertFalse("A chicken cannot fly!", chicken instanceof ICanFly);
    }

    @Test
    public void testParrotCanSingAndFly(){
        Assert.assertTrue("A parrot can sing and fly", parrot instanceof ICanSing && parrot instanceof ICanFly);
    }

}
