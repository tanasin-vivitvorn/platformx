package com.platformx.media.states;

public class Main {
    public static void main(String[] args) {
      VideoContext context = new VideoContext();
  
      PlayState playState = new PlayState();
      startState.doAction(context);
  
      System.out.println(context.getState().toString());
  
      ForwardState forwardState = new ForwardState();
      forwardState.doAction(context);

      System.out.println(context.getState().toString());
      
      RewindState rewindState = new RewindState();
      rewindState.doAction(context);
  
      System.out.println(context.getState().toString());
    }
  }