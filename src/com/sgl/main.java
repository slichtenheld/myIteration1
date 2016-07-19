package com.sgl;

import javax.swing.*;

/**
 * Created by sgl on 4/24/16.
 */
public class main {

    public static void main(String[] args) {

        //ViewManager viewManager = new ViewManager();

        //create JPanel first. Add to window. Start Thread. 
        Window window= new Window(500,500,"Test",new JPanel());

        Engine modelEngine = new Engine("model",60);

        modelEngine.addTickable(new TickTest("ONE: "));
        modelEngine.start();
        modelEngine.addTickable(new TickTest("TWO: "));

        Engine modelEngine2 = new Engine("model2",30);

        modelEngine2.addTickable(new TickTest("3: "));
        modelEngine2.start();
        modelEngine2.addTickable(new TickTest("4: "));

        modelEngine2.pause();
        modelEngine2.unpause();
    }

}
