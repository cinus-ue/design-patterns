package com.cinus.basic.prototype;

import com.cinus.basic.prototype.candies.Chocolate;
import com.cinus.basic.prototype.candies.Toffee;

public interface CandyFactory {

    Chocolate makeChocolate();

    Toffee makeToffee();
}
