package com.singtel.fauna.bird;

import com.singtel.fauna.Animal;
import com.singtel.fauna.behaviour.ICanFly;
import com.singtel.fauna.mammals.Cat;
import com.singtel.fauna.mammals.Dog;
import com.singtel.fauna.ResidenceType;

/**
 * Created by Arpit Khandelwal.
 */
public class Parrot extends Bird implements ICanFly {
    private Animal neighbour;

    private ResidenceType resType;

    public Parrot(){
        super();
        System.out.println("Hi, I am a Parrot!");
    }

    @Override
    public void fly() {
        System.out.println("A Parrot can fly!");
    }

    @Override
    public void say(){
        if(neighbour instanceof Dog){
            System.out.println("I stay with a Dog!");
            System.out.println("I utter - Woof, woof");
        }else if(neighbour instanceof Cat){
            System.out.println("I stay with a Cat!");
            System.out.println("I utter - Meow");
        }else if(neighbour instanceof Chicken && Chicken.ChickenType.MALE.equals(((Chicken)neighbour).getType())){
            System.out.println("I stay with a Rooster");
            System.out.println("I utter - Cock-a-doodle-doo");
        }else{
            System.out.println("I utter - Quack, quack");
        }
    }

    //-------------- Getters and Setters -----------------

    public Animal getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(Animal neighbour) {
        this.neighbour = neighbour;
    }

    public ResidenceType getResType() {
        return resType;
    }

    public void setResType(ResidenceType resType) {
        this.resType = resType;
    }
}
