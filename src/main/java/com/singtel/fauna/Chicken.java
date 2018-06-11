package com.singtel.fauna;

/**
 * Created by Arpit Khandelwal.
 */
public class Chicken extends Bird {

    private ChickenType type;

    public Chicken(ChickenType type){
        super();
        setCanFly(false);
        setType(type);
        if(ChickenType.MALE.equals(type)){
            System.out.println("Hi, I am a Rooster!");
        }else{
            System.out.println("Hi, I am a Chicken!");
        }
    }

    void sing(){
        if(ChickenType.MALE.equals(type)){
            System.out.println("I utter - Cock-a-doodle-doo");
        }else {
            System.out.println("I utter - Cluck, cluck");
        }
    }

    //------------ ENUMS -------------

    public enum ChickenType {
        MALE, FEMALE;
    }


    //------------  Getters and Setters ------------
    public ChickenType getType() {
        return type;
    }

    public void setType(ChickenType type) {
        this.type = type;
    }
}
