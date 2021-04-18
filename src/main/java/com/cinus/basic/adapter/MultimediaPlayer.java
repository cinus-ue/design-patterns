package com.cinus.basic.adapter;

import com.cinus.basic.adapter.audio.AudioPlayerAdapter;
import com.cinus.basic.adapter.video.VideoPlayerAdapter;

public class MultimediaPlayer {

    private AudioPlayerAdapter audioPlayerAdapter = new AudioPlayerAdapter();
    private VideoPlayerAdapter videoPlayerAdapter = new VideoPlayerAdapter();

    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            audioPlayerAdapter.setMediaType(mediaType);
            audioPlayerAdapter.play(fileName);
        } else if (mediaType.equalsIgnoreCase("avi") || mediaType.equalsIgnoreCase("mp4")) {
            videoPlayerAdapter.setMediaType(mediaType);
            videoPlayerAdapter.play(fileName);
        } else {
            System.out.println("Invalid media. " + mediaType + " format not supported");
        }
    }
}
