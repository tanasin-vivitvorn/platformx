package com.platformx.media.factory;

import com.platformx.media.factory.player.AudioPlayer;
import com.platformx.media.factory.player.VideoPlayer;

public class Main{
    public static void main(String[] args) {
        PlayerFactory playerFactory = new PlayerFactory();

        //get an object of AudioPlayer and call its methods.
        AudioPlayer audio = playerFactory.getPlayer("a.mp3");
        audio.Play();
        audio.Forward();
        audio.Rewind();

        VideoPlayer video = playerFactory.getPlayer("a.mp4");
        video.Play();
        video.Forward();
        video.Rewind();
    }
}