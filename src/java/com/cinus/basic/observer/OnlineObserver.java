package com.cinus.basic.observer;

public class OnlineObserver implements BizObserver {

    @Override
    public void notify(DeviceManager subject, DeviceState argument) {
        System.out.println("OnlineObserver, Received notify:" + argument.toString());
        if (argument == DeviceState.ACTIVE) {
            System.out.println("The device is online!");
        }
    }
}
