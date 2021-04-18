package com.cinus.basic.strategy;

@FunctionalInterface
public interface Strategy {
    int doOperation(int num1, int num2);
}
