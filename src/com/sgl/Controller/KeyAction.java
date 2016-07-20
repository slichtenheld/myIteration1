package com.sgl.Controller;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by slichtenheld on 7/19/2016.
 */
public class KeyAction implements KeyListener {

    private Action action;
    private Integer key;

    public KeyAction(Action action, Integer key, JComponent jComponent){
        this.action = action;
        this.key = key;
        jComponent.addKeyListener(this);
    }



    @Override
    public void keyTyped(KeyEvent e) {
        //ignore
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == key){
            action.perform();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
