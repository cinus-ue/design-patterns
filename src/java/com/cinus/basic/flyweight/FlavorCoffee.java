package com.cinus.basic.flyweight;

public class FlavorCoffee implements Order {
    private String flavor;

    FlavorCoffee(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String order() {
        return "Ordering " + flavor;
    }
}
