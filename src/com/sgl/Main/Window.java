package com.sgl.Main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sgl on 7/11/16.
 */
public class Window { // should it extend JFrame?

    public Window(int width, int height, String title, JPanel panel){
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // frame starts in middle of screen
        frame.add(panel);
        frame.setVisible(true);

    }


}
