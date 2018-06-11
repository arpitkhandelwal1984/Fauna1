package com.singtel.fauna;

/**
 * Created by Arpit Khandelwal.
 */
public class Parrot extends Bird {
    private Animal neighbour;

    private ResidenceType resType;

    public Parrot(){
        super();
        setCanSwim(false);
        setCanFly(true);
        System.out.println("Hi, I am a Parrot!");
    }

    void sing(){
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
