package com.singtel.fauna.mammals;

import com.singtel.fauna.Animal;
import com.singtel.fauna.behaviour.ICanSay;
import com.singtel.fauna.behaviour.ICanWalk;

/**
 * Created by Arpit Khandelwal.
 */
public abstract class Mammal extends Animal implements ICanSay, ICanWalk {
}
