package com.sgl;

/**
 * Created by slichtenheld on 7/18/2016.
 */
public class TickTest implements Tickable {

    private int data = 0;
    private String name;

    TickTest(String name){
        this.name = name;
    }

    @Override
    public void tick() {
        data+=1;
        System.out.println(name + data);
    }
}
