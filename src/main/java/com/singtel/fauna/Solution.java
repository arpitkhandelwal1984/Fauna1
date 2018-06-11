package com.singtel.fauna;

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
        Bird rooster = new Chicken(Chicken.ChickenType.MALE);

        Animal dolphin = new Dolphin();

    }
}
