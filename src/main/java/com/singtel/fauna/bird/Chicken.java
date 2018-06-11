package com.singtel.fauna.bird;

import com.singtel.fauna.bird.Bird;
import com.singtel.fauna.util.LocaleUtil;

/**
 * Created by Arpit Khandelwal.
 */
public class Chicken extends Bird {

    private ChickenType type;

    public Chicken(ChickenType type){
        super();
        this.type=type;
        if(ChickenType.MALE.equals(type)){
            System.out.println("Hi, I am a Rooster!");
        }else{
            System.out.println("Hi, I am a Chicken!");
        }
    }

    @Override
    public void say() {
        if(ChickenType.MALE.equals(type)){
            if("English".equalsIgnoreCase(LocaleUtil.getCurrentLocale())) {
                System.out.println("A Rooster says Cock-a-doodle-doo!");
            }else if("Hindi".equalsIgnoreCase(LocaleUtil.getCurrentLocale())){
                System.out.println("A Rooster says Ku-ka-do-ku!");
            }
        }else {
            System.out.println("A Chicken says Cluck, cluck!");
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
