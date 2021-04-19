package com.cinus.basic.singleton;

public class ThreadSafeDoubleCheckLocking {
    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking() {
        // to prevent instantiating by Reflection call
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance() {
        ThreadSafeDoubleCheckLocking result = instance;
        if (result == null) {
            synchronized (ThreadSafeDoubleCheckLocking.class) {
                result = instance;
                if (result == null) {
                    instance = result = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return result;
    }
}
