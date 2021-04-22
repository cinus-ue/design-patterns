package com.cinus.basic.flyweight;

public class CoffeeShop {


    private FlavorFactory flavorFactory;

    public CoffeeShop() {
        this.flavorFactory = new FlavorFactory();
        flavorFactory.addFlavor(Flavor.BLACK_COFFEE);
        flavorFactory.addFlavor(Flavor.CAPUCINO);
    }

    public String takeOrder(Flavor flavor) {
        return flavorFactory.getOrder(flavor);
    }
}
