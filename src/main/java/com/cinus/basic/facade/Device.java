package com.cinus.basic.facade;

public abstract class Device {

    public abstract String name();

    public void repair() {
        System.out.println("Repairing the " + name());
    }

    public void activate() {
        System.out.println("Activating the " + name());
    }

    public void deactivate() {
        System.out.println("Deactivating the " + name());
    }

    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    private void action(Action action) {
        switch (action) {
            case ACTIVE:
                activate();
                break;
            case DEACTIVATE:
                deactivate();
                break;
            case REPAIR:
                repair();
                break;
            default:
                System.out.println("Undefined action");
                break;
        }
    }

    enum Action {
        ACTIVE, DEACTIVATE, REPAIR,
    }
}
