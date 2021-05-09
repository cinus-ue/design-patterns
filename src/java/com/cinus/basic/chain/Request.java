package com.cinus.basic.chain;

import java.util.Objects;


public class Request {

    public enum RequestType {

        AUTH, NOTIFY, BYE

    }

    private final RequestType type;

    private final String desc;

    private boolean handled;


    public Request(final RequestType type, final String desc) {
        this.type = Objects.requireNonNull(type);
        this.desc = Objects.requireNonNull(desc);
    }

    public RequestType getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return this.handled;
    }

    @Override
    public String toString() {
        return getType() + ":" + getDesc();
    }

}
