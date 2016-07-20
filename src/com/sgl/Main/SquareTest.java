package com.sgl.Main;

import com.sgl.Controller.Action;
import com.sgl.Controller.KeyAction;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by slichtenheld on 7/18/2016.
 */
public class SquareTest implements Tickable, Action {



    private int data = 0;
    private String name;
    private KeyAction keyAction;

    public SquareTest(String name, JComponent jComponent){
        this.name = name;
        keyAction = new KeyAction(this,KeyEvent.VK_D, jComponent);
    }



    @Override
    public void tick() {

        System.out.println(name + data);
    }

    @Override
    public void perform() {
        data+=1;
    }

    public int getData() {
        return data;
    }
}
