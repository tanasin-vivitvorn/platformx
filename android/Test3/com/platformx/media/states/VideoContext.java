package com.platformx.media.states;

class VideoContext {
    private State state;
  
    public VideoContext() {
      state = null;
    }
  
    public void setState(State state) {
      this.state = state;
    }
  
    public State getState() {
      return state;
    }
  }