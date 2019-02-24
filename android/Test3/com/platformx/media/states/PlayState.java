package com.platformx.media.states;

import com.platformx.media.states.interfaces.State;

class PlayState implements State {
    public void doAction(Context context) {
        System.out.println("Playing");
        context.setState(this);  
    }
    public String toString() {
        return "Play State";
    }
}