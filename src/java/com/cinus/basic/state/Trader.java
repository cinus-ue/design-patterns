package com.cinus.basic.state;

public class Trader {

    private String type;

    public Trader(String type) {
        this.type = type;
    }

    public void trading() {
        System.out.println(type + ": Market opens and traders start trading.");
    }

    public void stopTrading() {
        System.out.println(type + ": The market is closed and traders stop trading.");
    }
}
