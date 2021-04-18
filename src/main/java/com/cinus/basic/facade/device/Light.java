package com.cinus.basic.facade.device;

import com.cinus.basic.facade.Device;

public class Light extends Device {

    private String name = "light";

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    public void changeBulb() {
        System.out.println(name() + ": changing the light-bulb.");
    }
}
