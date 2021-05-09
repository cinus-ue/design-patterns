package com.cinus.basic.Interpreter.expression;

import com.cinus.basic.Interpreter.Expression;
import com.cinus.basic.Interpreter.InterpretResult;
import com.cinus.basic.Interpreter.ResultType;

public class BooleanExpression extends Expression {

    private boolean value;

    public BooleanExpression(boolean value) {
        this.value = value;
    }

    public BooleanExpression(String s) {
        this.value = Boolean.parseBoolean(s);
    }

    @Override
    public InterpretResult<Boolean> interpret() {
        return new InterpretResult<>(ResultType.BOOLEAN, value);
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
