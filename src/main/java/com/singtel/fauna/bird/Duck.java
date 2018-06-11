package com.singtel.fauna.bird;

import com.singtel.fauna.behaviour.ICanFly;
import com.singtel.fauna.bird.Bird;

/**
 * Created by Arpit Khandelwal.
 */
public class Duck extends Bird implements ICanFly {

    public Duck(){
        super();
        System.out.println("Hi, I am a Duck!");
    }

    @Override
    public void say() {
        System.out.println("A Duck says Quack, quack!");
    }

}
