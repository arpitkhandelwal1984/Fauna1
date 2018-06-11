package com.singtel.fauna.mammals;

import com.singtel.fauna.Animal;

/**
 * Created by Arpit Khandelwal.
 */
public class Cat extends Mammal {
    public Cat(){
        System.out.println("I am a cat!");
    }

    @Override
    public void say() {
        System.out.println("I am a cat, I say meow!");
    }
}
