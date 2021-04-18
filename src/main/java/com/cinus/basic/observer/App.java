package com.cinus.basic.observer;

public class App {

    public static void main(String[] args) {
        DeviceManager manager = new DeviceManager();
        manager.addObserver(new OnlineObserver());
        manager.addObserver(new OfflineObserver());
        manager.updateDeviceState(DeviceState.INACTIVE);
        manager.updateDeviceState(DeviceState.ACTIVE);
    }
}
