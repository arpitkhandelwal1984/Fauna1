package com.singtel.fauna.fish;

/**
 * Created by Arpit Khandelwal.
 */
public class Shark extends Fish {
    public Shark(){
        super();
        setSize(Size.LARGE);
        setColour("Grey");
        System.out.println("I am a Shark!");
    }

    public void eat(Fish anotherFish){
        System.out.println("Eating 'anotherFish' ...  I will be honest, I wanted a fsh with an eye!");
    }
}
