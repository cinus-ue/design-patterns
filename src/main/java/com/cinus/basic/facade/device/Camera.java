package com.cinus.basic.facade.device;

import com.cinus.basic.facade.Device;

public class Camera extends Device {

    private String name = "camera";

    public Camera() {
    }

    public Camera(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    public void recording() {
        System.out.println(name() + ": video recording.");
    }
}
