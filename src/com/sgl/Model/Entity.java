package com.sgl.Model;

/**
 * Created by slichtenheld on 7/19/2016.
 */
public class Entity {

    protected int x;
    protected int y;
    protected String name; //for debugging purposes

    public Entity(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName(){
        return name;
    }

}
