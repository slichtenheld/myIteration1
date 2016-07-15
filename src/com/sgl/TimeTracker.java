package com.sgl;

/**
 * Created by sgl on 7/14/16.
 */
public class TimeTracker {

    public enum SleepThread{SLEEP, DONT_SLEEP};

    private long timerLength;
    private long startTime;

    public TimeTracker(long timerLength){
        this.timerLength = timerLength;
        startTime = 0;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public SleepThread end(){
        long delta = System.currentTimeMillis() - startTime;
        if (delta < timerLength) return SleepThread.SLEEP;
        return SleepThread.DONT_SLEEP;
    }
}
