package com.singtel.fauna.bird;

import com.singtel.fauna.Animal;
import com.singtel.fauna.behaviour.ICanFly;
import com.singtel.fauna.behaviour.ICanSay;
import com.singtel.fauna.behaviour.ICanSing;

/**
 * Created by Arpit Khandelwal.
 */
public abstract class Bird extends Animal implements ICanSay, ICanSing {

}
