package com.cinus.basic.proxy;

public class Proxy {
    private Object adaptee = null;

    public Proxy() {
    }

    public Proxy wrap(Object adaptee) {
        this.setAdaptee(adaptee);
        return this;
    }

    public Object getAdaptee() {
        return this.adaptee;
    }

    public void setAdaptee(Object adaptee) {
        this.adaptee = adaptee;
    }

    public Object invokeMethod(String name, Object... args) throws Exception {

        return InvokerHelper.invokeMethod(this.adaptee, name, args);

    }

}