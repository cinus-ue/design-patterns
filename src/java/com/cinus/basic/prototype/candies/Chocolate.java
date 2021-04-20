package com.cinus.basic.prototype.candies;

import com.cinus.basic.prototype.Prototype;

public class Chocolate extends Prototype {

    private String name;

    public Chocolate(String name) {
        this.name = name;
    }

    public Chocolate(Chocolate chocolate) {
        this.name = chocolate.name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Chocolate copy() throws CloneNotSupportedException {
        return new Chocolate(this);
    }
}
