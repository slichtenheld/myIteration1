package com.sgl.View;

import com.sgl.Main.SquareTest;
import com.sgl.Main.Tickable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by slichtenheld on 7/19/2016.
 */
public class AreaViewPort extends JPanel implements Tickable {

    int x = 0; int y =0;

    SquareTest squareTest;

    public AreaViewPort(){
        this.setFocusable(true);
        this.squareTest= new SquareTest("test",this);
    }

    @Override
    public void tick() {
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        //gotta use that AA
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.black);
        g2d.fillRect(squareTest.getData(),squareTest.getData(),100,100);


        g2d.dispose();
    }



}
