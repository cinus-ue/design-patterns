package com.cinus.basic.flyweight;


public class App {

    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        System.out.println(coffeeShop.takeOrder(Flavor.BLACK_COFFEE));
        System.out.println(coffeeShop.takeOrder(Flavor.CAPUCINO));
    }
}
