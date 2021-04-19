package com.cinus.basic.observer;

public class DeviceManager extends Observable<DeviceManager, BizObserver, DeviceState>{

    private DeviceState deviceState = DeviceState.INACTIVE;

    public void updateDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
        notifyObservers(deviceState);
    }


}
