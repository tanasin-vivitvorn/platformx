package com.platformx.media.factory;

import com.platformx.media.factory.interfaces;

class PlayerFactory implements Player {

    //use getPlayer method to get object of type Player 
    public Player getPlayer(String fileName) {
        if(fileName.endsWith(".mp3")){
            return new AudioPlayer(fileName);
        }else if(fileName.endsWith(".avi")){
            return new VideoPlayer(fileName);
        }
    }
}