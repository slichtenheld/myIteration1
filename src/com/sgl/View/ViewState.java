package com.sgl.View;

import com.sgl.State;
import com.sgl.Tickable;
import com.sun.prism.Graphics;

import javax.swing.*;

/**
 * Created by sgl on 4/24/16.
 */
public abstract class ViewState extends JPanel implements State, Tickable {

    private ViewManager viewManager;

    public ViewState(ViewManager viewManager){
        this.viewManager = viewManager;
    }

    @Override
    public void setState(int state) {
        viewManager.setState(state);
    }

    public abstract void paintComponent(Graphics g);

}
