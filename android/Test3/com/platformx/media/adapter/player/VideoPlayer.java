package com.platformx.media.adapter;

import com.platformx.media.Interfaces.iAudioPlayer;

class VideoPlayer implements iVideoPlayer {

    private String fileName;

    public VideoPlayer(String fileName){
        this.fileName = fileName;
    }
    
    @Override
    public void playVideo() {
        System.out.println("Playing. Name: " + this.fileName);    
    }

    @Override
    public void forwardVideo() {
        System.out.println("Forwarding. Name: " + this.fileName);    
    }

    @Override
    public void rewindVideo() {
        System.out.println("Rewinding. Name: " + this.fileName);    
    }
}