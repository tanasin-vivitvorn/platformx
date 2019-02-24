package com.platformx.media.states;

import com.platformx.media.states.interfaces.State;

class ForwardState implements State {
    public void doAction(Context context) {
        System.out.println("Forwarding");
        context.setState(this);  
    }
    public String toString() {
        return "Forward State";
    }
}