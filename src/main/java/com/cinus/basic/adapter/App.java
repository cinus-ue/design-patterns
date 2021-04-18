package com.cinus.basic.adapter;

public class App {


    public static void main(String[] args) {
        MultimediaPlayer player = new MultimediaPlayer();
        player.play("mp3", "beyond the horizon.mp3");
        player.play("mp4", "alone.mp4");
        player.play("avi", "mind me.avi");
        player.play("vlc", "far far away.vlc");
    }
}
