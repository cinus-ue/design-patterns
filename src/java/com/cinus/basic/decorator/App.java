package com.cinus.basic.decorator;

public class App {
    public static void main(String[] args) {
        Noodles noodles = new Noodles();
        BeefDecorator beefDecorator = new BeefDecorator(noodles);
        beefDecorator.cooking();
    }
}
