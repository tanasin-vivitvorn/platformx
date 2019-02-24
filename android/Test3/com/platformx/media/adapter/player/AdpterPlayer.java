package com.platformx.media.adapter;

import com.platformx.media.interfaces.Player;

class AdpterPlayer implements Player {

   AudioPlayer audioPlayer = null;
   VideoPlayer videoPlayer = null;
   
   public AdpterPlayer(String fileName){    
      if(fileName.endsWith(".mp3")){
         MEDIA_TYPE = AUDIO_TYPE;
         audioPlayer = new AudioPlayer(fileName);
      }else if(fileName.endsWith(".avi")){
         MEDIA_TYPE = VIDEO_TYPE;
         videoPlayer = new VideoPlayer(fileName);
      }  
   }

   @Override
   public void Play() {
      if(audioPlayer != null){
         audioPlayer.playAudio();
      } else {
         videoPlayer.playVideo();
      }
   }

   @Override
   public void Forward() {
      if(audioPlayer != null){
         audioPlayer.forwardAudio();
      } else {
         videoPlayer.forwardVideo();
      }
   }

   @Override
   public void Rewind() {
      if(audioPlayer != null){
         audioPlayer.rewindAudio();
      } else {
         videoPlayer.rewindVideo();
      }
   }

}