package com.cinus.basic.singleton;

public class LazyLoaded {

    /**
     * Private constructor.
     */
    private LazyLoaded() {
    }

    public static LazyLoaded getInstance() {
        return HelperHolder.INSTANCE;
    }


    private static class HelperHolder {
        private static final LazyLoaded INSTANCE = new LazyLoaded();
    }
}
