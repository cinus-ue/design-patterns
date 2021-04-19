package com.cinus.basic.factory;

import com.cinus.basic.factory.candies.Candy;
import com.cinus.basic.factory.candies.Chocolate;
import com.cinus.basic.factory.candies.Lollipop;
import com.cinus.basic.factory.candies.Toffee;

public class App {

    public static void main(String[] args) {
        CandyFactory factory = CandyFactory.factory(maker -> {
            maker.add(CandyType.CHOCOLATE, Chocolate::new);
            maker.add(CandyType.LOLLIPOP, Lollipop::new);
            maker.add(CandyType.TOFFEE, Toffee::new);
        });
        Candy candy = factory.make(CandyType.CHOCOLATE);
        System.out.println(candy.toString());
    }
}
