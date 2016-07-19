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
    private boolean running = true;
    private boolean paused = false;


    public Engine(String name, long tickRate){
        this.name = name;
        timeTracker = new TimeTracker(1000/tickRate); // converts update frequency to timer/period length
        tickList = new ArrayList<>();
    }


    public void addTickable (Tickable tickable) {
        tickList.add(tickable);
    }

    public void pause(){
        System.out.println(name +" thread paused");
        paused = true;
    }

    public void unpause(){
        System.out.println(name +" thread unpaused");
        paused = false;
    }

    public void kill(){
        System.out.println(name +" thread killed");
        running = false;
    }



    @Override
    public void run() {
        this.setName(name);
        System.out.println("Starting Thread: " + name);

        while(running){
            while(!paused){
                timeTracker.start();
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
