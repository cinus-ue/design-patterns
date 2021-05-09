package com.cinus.basic.Interpreter.expression;

import com.cinus.basic.Interpreter.Expression;
import com.cinus.basic.Interpreter.InterpretResult;
import com.cinus.basic.Interpreter.ResultType;

public class AndExpression extends Expression {

    private BooleanExpression expr1;
    private BooleanExpression expr2;

    public AndExpression(BooleanExpression expr1, BooleanExpression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public InterpretResult<Boolean> interpret() {
        return new InterpretResult<>(ResultType.BOOLEAN, expr1.interpret().getValue() && expr2.interpret().getValue());
    }

    @Override
    public String toString() {
        return expr1.toString() + " and " + expr2.toString();
    }
}
