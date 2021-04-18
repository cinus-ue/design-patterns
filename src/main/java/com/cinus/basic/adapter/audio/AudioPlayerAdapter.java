package com.cinus.basic.adapter.audio;

import com.cinus.basic.adapter.MediaPlayer;

public class AudioPlayerAdapter implements MediaPlayer {

    private String mediaType;
    private Mp3Player mp3Player = new Mp3Player();

    @Override
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public void play(String fileName) {
        if (this.mediaType.equalsIgnoreCase("mp3")) {
            mp3Player.playMp3(fileName);
        }
    }
}
