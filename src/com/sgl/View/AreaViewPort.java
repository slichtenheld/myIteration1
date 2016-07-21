package com.sgl.View;

import com.sgl.Main.Tickable;
import com.sgl.Model.Entity;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by slichtenheld on 7/19/2016.
 */
public class AreaViewPort extends JPanel implements Tickable {

    private List<Entity> entityList;

    public AreaViewPort(){
        this.setFocusable(true);
        entityList = new ArrayList<>(5);
    }

    public void addEntity(Entity entity){
        entityList.add(entity);
    }

    @Override
    public void tick() {
        // FIXME: DEBUGGING PURPOSES
//        entityList.forEach((temp) -> {
//            System.out.println(temp.getName());
//        });
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
        entityList.forEach((temp) -> {
            g2d.fillRect(temp.getX(),temp.getY(),25,25);
        });



        g2d.dispose();
    }



}
