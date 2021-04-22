package com.cinus.basic.decorator;

public class BeefDecorator extends NoodlesDecorator {
    public BeefDecorator(Noodles noodles) {
        super(noodles);
    }

    @Override
    public void cooking() {
        super.cooking();
        System.out.println("cooking beef flavour noodles");
    }
}
