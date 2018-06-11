package com.singtel.fauna.insect;

import com.singtel.fauna.Animal;
import com.singtel.fauna.behaviour.ICanFly;

/**
 * Created by Arpit Khandelwal.
 */
public class Butterfly extends Animal implements ICanFly {
    public Butterfly(){
        super();
        System.out.println("Hi, I am a Butterfly!");
    }
}
