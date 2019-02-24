package com.platformx.media.factory.player;

import com.platformx.media.factory.interfaces.Player;

class VideoPlayer implements Player {
    private String fileName;

    public VideoPlayer(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void Play() {
        System.out.println("Playing. Name: " + this.fileName);    
    }

    @Override
    public void Forward() {
        System.out.println("Forwarding. Name: " + this.fileName);    
    }

    @Override
    public void Rewind() {
        System.out.println("Rewinding. Name: " + this.fileName);    
    }
}