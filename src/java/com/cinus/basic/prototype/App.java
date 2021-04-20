package com.cinus.basic.prototype;

import com.cinus.basic.prototype.candies.Chocolate;
import com.cinus.basic.prototype.candies.Toffee;

public class App {

    public static void main(String[] args) {
        CandyFactory candyFactory = new CandyFactoryImpl(new Chocolate("chocolate candy"), new Toffee("toffee candy"));
        Chocolate chocolate = candyFactory.makeChocolate();
        System.out.println(chocolate.toString());
        Toffee toffee = candyFactory.makeToffee();
        System.out.println(toffee.toString());
    }
}
