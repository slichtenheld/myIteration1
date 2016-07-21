package com.sgl.Main;

import com.sgl.Controller.Actions.MovementActions.*;
import com.sgl.Controller.KeyActionMap;
import com.sgl.Model.MoveableEntity;
import com.sgl.View.AreaViewPort;
import com.sgl.Main.Threads.Engine;
import com.sun.glass.events.KeyEvent;

/**
 * Created by sgl on 4/24/16.
 */
public class main {

    public static void main(String[] args) {

        //create JPanel first. Add to window. Start Thread.

        AreaViewPort areaViewPort = new AreaViewPort();

        new Window(1920,1080,"Test",areaViewPort);
        KeyActionMap keyActionMap = new KeyActionMap(areaViewPort);

        Engine viewEngine = new Engine("model",60);
        viewEngine.addTickable(areaViewPort);
        viewEngine.start();


        MoveableEntity player = new MoveableEntity(100,100, "test");
        areaViewPort.addEntity(player);

        MoveCommand moveDown = new MoveDown(player);
        MoveCommand moveUp = new MoveUp(player);
        MoveCommand moveLeft = new MoveLeft(player);
        MoveCommand moveRight = new MoveRight(player);

        keyActionMap.putAction(KeyEvent.VK_W, moveUp);
        keyActionMap.putAction(KeyEvent.VK_A, moveLeft);
        keyActionMap.putAction(KeyEvent.VK_S, moveDown);
        keyActionMap.putAction(KeyEvent.VK_D, moveRight);

    }

}
