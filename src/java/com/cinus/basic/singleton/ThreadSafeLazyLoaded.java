package com.cinus.basic.singleton;

public class ThreadSafeLazyLoaded {

    private static ThreadSafeLazyLoaded instance;

    private ThreadSafeLazyLoaded() {
        // protect against instantiation via reflection
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }


    public static synchronized ThreadSafeLazyLoaded getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoaded();
        }
        return instance;
    }
}
