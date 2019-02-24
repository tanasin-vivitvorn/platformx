package com.platformx.media.states;

import com.platformx.media.states.interfaces.State;

class RewindState implements State {
    public void doAction(Context context) {
        System.out.println("Rewinding");
        context.setState(this);  
    }
    public String toString() {
        return "Rewind State";
    }
}