package com.sgl.View;

import com.sun.prism.Graphics;

/**
 * Created by sgl on 4/24/16.
 */
public class GameState extends ViewState {

    boolean paused;

    public GameState(ViewManager viewManager) {
        super(viewManager);
        paused = false;
    }

    public void pause(){
        paused = true;
    }
    public void resume(){
        paused=false;
    }

    @Override
    public void tick() {
        if (!paused){

        }
    }

    @Override
    public void paintComponent(Graphics g) {

    }
}
