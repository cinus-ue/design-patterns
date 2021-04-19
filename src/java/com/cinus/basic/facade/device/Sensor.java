package com.cinus.basic.facade.device;

import com.cinus.basic.facade.Device;

public class Sensor extends Device {

    @Override
    public String name() {
        return "sensor";
    }

    public void trigger() {
        System.out.println("The sensor has triggered.");
    }
}
