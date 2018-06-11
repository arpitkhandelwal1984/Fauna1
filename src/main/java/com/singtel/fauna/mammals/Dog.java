package com.singtel.fauna.mammals;

import com.singtel.fauna.Animal;

/**
 * Created by Arpit Khandelwal.
 */
public class Dog extends Mammal {
    public Dog(){
        System.out.println("I am a dog!");
    }


    @Override
    public void say() {
        System.out.println("I am a dog, I say woof!");
    }
}
