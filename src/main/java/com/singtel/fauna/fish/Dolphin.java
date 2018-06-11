package com.singtel.fauna.fish;

import com.singtel.fauna.Animal;
import com.singtel.fauna.behaviour.ICanSwim;

/**
 * Created by Arpit Khandelwal.
 */
public class Dolphin extends Animal implements ICanSwim {
    public Dolphin(){
        super();
        System.out.println("Hi, I am a Dolphin!");
    }
}
