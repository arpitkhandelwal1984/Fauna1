package com.singtel.fauna.fish;

/**
 * Created by Arpit Khandelwal.
 */
public class Clownfish extends Fish {
    public Clownfish(){
        super();
        setSize(Size.LARGE);
        setColour("Orange");
        System.out.println("I am a ClownFish!");
    }

    public void makeAJoke(){
        System.out.println("Making a joke - What do you call a fish without an eye? - A fsh");
    }
}
