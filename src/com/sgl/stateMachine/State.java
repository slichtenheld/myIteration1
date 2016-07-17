package com.sgl.stateMachine;

/**
 * Created by sgl on 7/15/16.
 */

// Interface: State
//
// State interface which keeps lifecycle of state

public interface State {

    public void create(StateTransition stateTransition);

    public void setStateMachine(StateTransition stateTransition);

    public void remove(StateTransition stateTransition);

    public void kill(StateTransition stateTransition);
}
