package com.singtel.fauna;

/**
 * Created by Arpit Khandelwal.
 */
public class Duck extends Bird {

    public Duck(){
        super();
        setCanSwim(true);
        System.out.println("Hi, I am a Duck!");
    }

    void sing(){
        System.out.println("I utter - Quack, quack");
    }
}
