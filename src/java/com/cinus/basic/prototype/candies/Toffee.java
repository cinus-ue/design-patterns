package com.cinus.basic.prototype.candies;

import com.cinus.basic.prototype.Prototype;

public class Toffee extends Prototype {

    private String name;

    public Toffee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Toffee copy() throws CloneNotSupportedException {
        return (Toffee) super.clone();
    }
}
