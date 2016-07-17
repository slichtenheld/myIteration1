package com.sgl;

/**
 * Created by sgl on 7/14/16.
 */
public class TimeTracker {

    public enum SleepThread{SLEEP, DONT_SLEEP};

    private long timerLength    = 0;
    private long startTime      = 0;
    private long timeleft       = 0;

    public TimeTracker(long timerLength){
        this.timerLength = timerLength;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public SleepThread end(){
        long delta = System.currentTimeMillis() - startTime;
        timeleft = timerLength - delta;
        if (delta < timerLength) return SleepThread.SLEEP;
        return SleepThread.DONT_SLEEP;
    }
    public long getTimeleft() {
        return timeleft;
    }
}
