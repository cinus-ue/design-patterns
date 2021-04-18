package com.cinus.basic.facade;

public class App {

    public static void main(String[] args) {
        SecurityFacade facade = new SecurityFacade();
        facade.powerOn();
        facade.videoRecording();
    }
}
