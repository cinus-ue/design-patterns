package com.cinus.basic.Interpreter;

public abstract class Expression {

    public abstract InterpretResult interpret();

    @Override
    public abstract String toString();
}
