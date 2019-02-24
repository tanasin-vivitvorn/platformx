package com.platformx.media.adapter;

import com.platformx.media.Interfaces.iAudioPlayer;

class AudioPlayer implements iAudioPlayer {
    private String fileName;

    public AudioPlayer(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void playAudio() {
        System.out.println("Playing. Name: " + this.fileName);    
    }

    @Override
    public void forwardAudio() {
        System.out.println("Forwarding. Name: " + this.fileName);    
    }

    @Override
    public void rewindAudio() {
        System.out.println("Rewinding. Name: " + this.fileName);    
    }
}