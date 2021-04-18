package com.cinus.basic.facade;

import com.cinus.basic.facade.device.Alarm;
import com.cinus.basic.facade.device.Camera;
import com.cinus.basic.facade.device.Light;
import com.cinus.basic.facade.device.Sensor;

import java.util.*;

public class SecurityFacade {

    enum DeviceType {
        CAMERA, ALARM, LIGHT, SENSOR
    }

    private final Map<DeviceType, List<Device>> devices;

    public SecurityFacade() {
        devices = new HashMap<>();
        for (DeviceType deviceType : DeviceType.values()) {
            devices.put(deviceType, new LinkedList<>());
        }
        devices.get(DeviceType.CAMERA).add(new Camera("camera1"));
        devices.get(DeviceType.CAMERA).add(new Camera("camera2"));
        devices.get(DeviceType.CAMERA).add(new Camera("camera3"));
        devices.get(DeviceType.CAMERA).add(new Camera("camera4"));
        devices.get(DeviceType.ALARM).add(new Alarm());
        devices.get(DeviceType.LIGHT).add(new Light("light1"));
        devices.get(DeviceType.LIGHT).add(new Light("light2"));
        devices.get(DeviceType.LIGHT).add(new Light("light3"));
        devices.get(DeviceType.LIGHT).add(new Light("light4"));
        devices.get(DeviceType.SENSOR).add(new Sensor());
    }

    public void powerOn() {
        devices.values().forEach(devices -> makeActions(devices, Device.Action.ACTIVE));
    }

    public void powerOff() {
        devices.values().forEach(devices -> makeActions(devices, Device.Action.DEACTIVATE));
    }


    public void ring() {
        devices.get(DeviceType.ALARM).forEach(device -> {
            Alarm alarm = (Alarm) device;
            alarm.ring();
        });
    }

    public void videoRecording() {
        devices.get(DeviceType.CAMERA).forEach(device -> {
            Camera camera = (Camera) device;
            camera.recording();
        });
    }

    private static void makeActions(Collection<Device> devices, Device.Action... actions) {
        for (Device device : devices) {
            device.action(actions);
        }
    }

}
