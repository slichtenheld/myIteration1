package com.sgl.stateMachine;

/**
 * Created by sgl on 7/15/16.
 */

// Class: StateFactory
//
// Abstract class to create empty States

public abstract class StateFactory {

    public static State createState(){
        return new State();
    }
}
