package com.cinus.basic.adapter.video;

import com.cinus.basic.adapter.MediaPlayer;

public class VideoPlayerAdapter implements MediaPlayer {

    private String mediaType;
    private Mp4Player mp4Player = new Mp4Player();
    private AviPlayer aviPlayer = new AviPlayer();

    @Override
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public void play(String fileName) {
        if (this.mediaType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        } else if (this.mediaType.equalsIgnoreCase("avi")) {
            aviPlayer.playAvi(fileName);
        }
    }
}
