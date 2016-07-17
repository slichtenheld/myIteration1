package com.sgl.stateMachine;

/**
 * Created by sgl on 7/16/16.
 */
public class StateContext implements State, StateTransition{

    private State state;

    StateContext(){
        changeStateTo(StateTransition.RESET);
    }


    @Override
    public void create() {
        state.create(this);
    }

    @Override
    public void setStateMachine() {
        state.setStateMachine(this);
    }

    @Override
    public void remove() {
        state.remove(this);
    }

    @Override
    public void kill() {
        state.kill(this);
    }
}
