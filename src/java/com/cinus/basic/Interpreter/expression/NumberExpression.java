package com.cinus.basic.Interpreter.expression;

import com.cinus.basic.Interpreter.Expression;
import com.cinus.basic.Interpreter.InterpretResult;
import com.cinus.basic.Interpreter.ResultType;

public class NumberExpression extends Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String s) {
        this.number = Integer.parseInt(s);
    }

    @Override
    public InterpretResult<Integer> interpret() {
        return new InterpretResult<>(ResultType.NUMBER, number);
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
