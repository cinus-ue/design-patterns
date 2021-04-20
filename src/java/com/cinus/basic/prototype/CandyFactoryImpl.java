package com.cinus.basic.prototype;


import com.cinus.basic.prototype.candies.Chocolate;
import com.cinus.basic.prototype.candies.Toffee;

public class CandyFactoryImpl implements CandyFactory {

    private Chocolate chocolate;
    private Toffee toffee;

    public CandyFactoryImpl(Chocolate chocolate, Toffee toffee) {
        this.chocolate = chocolate;
        this.toffee = toffee;
    }

    @Override
    public Chocolate makeChocolate() {
        try {
            return chocolate.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Toffee makeToffee() {
        try {
            return toffee.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
