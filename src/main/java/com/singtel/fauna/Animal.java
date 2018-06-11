package com.singtel.fauna;

/**
 * Created by Arpit Khandelwal.
 */
public abstract class Animal {

    private String colour;

    private Size size;

    public enum Size{
        SMALL, LARGE, HUGE;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
