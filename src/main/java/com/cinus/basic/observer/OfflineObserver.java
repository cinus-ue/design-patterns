package com.cinus.basic.observer;

public class OfflineObserver implements BizObserver {

    @Override
    public void notify(DeviceManager subject, DeviceState argument) {
        System.out.println("OfflineObserver, Received notify:" + argument.toString());
        if (argument == DeviceState.INACTIVE) {
            System.out.println("The device is offline!");
        }
    }
}
