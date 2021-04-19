package com.cinus.basic.factory;

import com.cinus.basic.factory.candies.Candy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface CandyFactory {

    Candy make(CandyType name);

    static CandyFactory factory(Consumer<Maker> consumer) {
        Map<CandyType, Supplier<Candy>> map = new HashMap<>();
        consumer.accept(map::put);
        return name -> map.get(name).get();
    }
}
