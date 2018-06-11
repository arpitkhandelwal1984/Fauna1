package com.singtel.fauna;

/**
 * Created by Arpit Khandelwal.
 */
public class Bird extends Animal {

    private boolean canSwim;

    private boolean canFly;

    //------------- Business Methods -----------------

    void fly() {
        if(canFly) {
            System.out.println("I am flying");
        }else{
            System.out.println("I can't fly");
        }
    }

    void sing() {
        System.out.println("I am singing");
    }

    void swim(){
        if(canSwim) {
            System.out.println("I am swimming");
        }else{
            System.out.println("I can't swim");
        }
    }

    //-------------- Getters and Setters -----------------
    public boolean canSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
