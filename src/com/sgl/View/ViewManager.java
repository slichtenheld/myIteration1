package com.sgl.View;

import com.sgl.State;
import com.sgl.Tickable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sgl on 4/24/16.
 */
public class ViewManager extends JFrame implements State, Runnable, Tickable {

    private IntroState introState;
    private CreateNewGameState createNewGameState;
    private GameState gameState;
    private ViewState currentState;

    private ViewState[] viewStates;

    private final int TICK_RATE = 60 ;
    private volatile boolean running = true;


    public ViewManager(){
        initJFrame();
        //create all states and give them its handle so they can tell ViewManager which state to be in
        introState = new IntroState(this);
        createNewGameState = new CreateNewGameState(this);
        gameState = new GameState(this);
        viewStates = new ViewState[]{introState, createNewGameState, gameState};
        currentState = viewStates[0];
        start();
    }

    @Override
    public void setState(int state) {

    }

    @Override
    public void tick(){
        currentState.tick();
    }

    private void initJFrame(){
        setTitle("test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLayout(new BorderLayout());
        // dimensions of game screen initially
        Dimension panelDimension = new Dimension(1080, 720);
        setSize(panelDimension);
        setMinimumSize(panelDimension);
        setLocationRelativeTo(null);
        // canvas used to paint images onto frame
        getContentPane().setLayout(new BorderLayout());
        // move to View manager?
        pack();
        setVisible(true);
    }


    private synchronized void start(){
        new Thread(this).start();
    }

    @Override
    public void run() {

        long lastTime;
        long delta;
        long waitTime;

        while (running) {

            lastTime = System.nanoTime();

            this.tick();

            delta = System.nanoTime() - lastTime;

            int TARGET_TIME = 1000 / TICK_RATE;
            waitTime = TARGET_TIME - delta / 1000000;

            if (waitTime < TARGET_TIME) {
                waitTime = TARGET_TIME;
            }
            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
