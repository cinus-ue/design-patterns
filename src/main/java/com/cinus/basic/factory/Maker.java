package com.cinus.basic.factory;

import com.cinus.basic.factory.candies.Candy;

import java.util.function.Supplier;


public interface Maker {
    void add(CandyType name, Supplier<Candy> supplier);
}
