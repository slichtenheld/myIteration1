package com.sgl.stateMachine;

/**
 * Created by sgl on 7/15/16.
 */

// Interface: State
//
// State interface which keeps lifecycle of state

public interface State {

    void create(StateTransition stateTransition);

    void setStateMachine(StateTransition stateTransition);

    void remove(StateTransition stateTransition);

    void kill(StateTransition stateTransition);
}
