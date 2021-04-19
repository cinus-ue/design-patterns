package com.cinus.basic.singleton;

public enum EnumSingleObject {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
