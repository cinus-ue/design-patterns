package com.cinus.basic.Interpreter.expression;

import com.cinus.basic.Interpreter.Expression;
import com.cinus.basic.Interpreter.InterpretResult;
import com.cinus.basic.Interpreter.ResultType;

public class PlusExpression extends Expression {

    private NumberExpression expr1;
    private NumberExpression expr2;

    public PlusExpression(NumberExpression expr1, NumberExpression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public InterpretResult<Integer> interpret() {
        return new InterpretResult<>(ResultType.NUMBER, expr1.interpret().getValue() + expr2.interpret().getValue());
    }

    @Override
    public String toString() {
        return expr1.toString()+" + " + expr2.toString();
    }
}
