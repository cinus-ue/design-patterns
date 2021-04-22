package com.cinus.basic.decorator;

public abstract class NoodlesDecorator implements Cook {

    private Noodles noodles;

    public NoodlesDecorator(Noodles noodles) {
        this.noodles = noodles;
    }

    @Override
    public void cooking() {
        noodles.cooking();
    }
}
