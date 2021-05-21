package com.cinus.basic.observer;

public enum DeviceState {
    ACTIVE, INACTIVE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
