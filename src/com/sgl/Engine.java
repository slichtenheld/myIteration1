package com.sgl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgl on 7/14/16.
 */

// CLASS: Engine
//
// ** should be able to be used for model and view threads
// ** call start on Engine to kick off thread


public class Engine extends Thread{

    private String name;
    private TimeTracker timeTracker;
    private List<Tickable> tickList;
    private boolean running;
    private boolean paused;


    public Engine(String name, long tickRate){
        this.name = name;
        timeTracker = new TimeTracker(1000/tickRate); // converts update frequency to timer/period length
        tickList = new ArrayList<>();
    }


    @Override
    public void run() {
        this.setName(name);
        running = true;
        paused = false;
        System.out.println("Starting Thread");

        while(running){
            while(!paused){
                timeTracker.start();
                System.out.println("\n==> starting to tick through objects....");
                tickList.forEach((temp) -> {
                    temp.tick();
                });
                if (timeTracker.end()== TimeTracker.SleepThread.SLEEP) {
                    try {
                        this.sleep(timeTracker.getTimeleft());
                    } catch (Exception e) {}
                }
            }
        }
    }
}
