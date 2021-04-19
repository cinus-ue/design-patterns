package com.cinus.basic.facade.device;

import com.cinus.basic.facade.Device;

public class Alarm extends Device {


    @Override
    public String name() {
        return "alarm";
    }

    public void ring() {
        System.out.println("Ringing the alarm.");
    }

    public void stopRing() {
        System.out.println("Stop the alarm.");
    }
}
