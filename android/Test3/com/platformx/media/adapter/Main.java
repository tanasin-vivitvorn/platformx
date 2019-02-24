package com.platformx.media.adapter;

import com.platformx.media.Adapter.Player.AdpterPlayer;

public class Main{
   public static void main(String[] args) {
      AdpterPlayer aPlayer = new AdpterPlayer();

      aPlayer.Play("me.avi");
      aPlayer.Forward();
      aPlayer.Rewind();

      aPlayer.Play("h.mp3");
      aPlayer.Forward();
      aPlayer.Rewind();
   }
}