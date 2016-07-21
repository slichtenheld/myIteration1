package com.sgl.Controller;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by slichtenheld on 7/19/2016.
 */
public class KeyActionMap implements KeyListener {

    private Map<Integer,Command> keyActionMap;

    public KeyActionMap(JComponent jComponent){
        jComponent.addKeyListener(this);
        keyActionMap = new HashMap<>(5);
    }

    public void putAction(Integer keyCode, Command action){
        keyActionMap.put(keyCode,action);
    }

    public void removeKeyEvent(Integer keyCode){
        keyActionMap.remove(keyCode);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //ignore
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyActionMap.get(e.getKeyCode()).execute();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
