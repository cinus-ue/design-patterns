package com.cinus.basic.singleton;

public class SingleObject {

    private SingleObject() {
    }

    private static final SingleObject INSTANCE = new SingleObject();

    public static SingleObject getInstance() {
        return INSTANCE;
    }
}
