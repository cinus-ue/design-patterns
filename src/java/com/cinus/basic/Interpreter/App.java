package com.cinus.basic.Interpreter;


import com.cinus.basic.Interpreter.expression.*;
import com.cinus.util.LogUtils;

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        execute("6 5 > 4 5 < &&");
        execute("6 5 > 5 5 < &&");
        execute("6 5 >= 5 5 == &&");
        execute("6 5 <= 5 5 == ||");
        execute("4 3 2 - 1 + *");
    }

    public static void execute(String tokenString) {
        String[] tokenList = tokenString.split(" ");
        Stack<Expression> stack = new Stack<>();
        for (String s : tokenList) {
            if (isComparator(s)) {
                NumberExpression rightExpression = (NumberExpression) stack.pop();
                NumberExpression leftExpression = (NumberExpression) stack.pop();
                Expression operator = getComparatorInstance(s, leftExpression, rightExpression);
                LogUtils.info("comparator: %s", operator);
                boolean result = (boolean) operator.interpret().getValue();
                BooleanExpression resultExpression = new BooleanExpression(result);
                stack.push(resultExpression);
                LogUtils.info("push result to stack: %s", resultExpression.interpret());
            } else if (isOperator(s)) {
                NumberExpression rightExpression = (NumberExpression) stack.pop();
                NumberExpression leftExpression = (NumberExpression) stack.pop();
                Expression operator = getOperatorInstance(s, leftExpression, rightExpression);
                LogUtils.info("operator: %s", operator);
                int result = (int) operator.interpret().getValue();
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                LogUtils.info("push result to stack: %s", resultExpression.interpret());
            } else if (isLogicalOperator(s)) {
                BooleanExpression rightExpression = (BooleanExpression) stack.pop();
                BooleanExpression leftExpression = (BooleanExpression) stack.pop();
                Expression logicalOperator = getLogicalOperatorInstance(s, leftExpression, rightExpression);
                LogUtils.info("logical operator: %s", logicalOperator);
                boolean result = (boolean) logicalOperator.interpret().getValue();
                BooleanExpression resultExpression = new BooleanExpression(result);
                stack.push(resultExpression);
                LogUtils.info("push result to stack: %s", resultExpression.interpret());
            } else {
                Expression i = new NumberExpression(s);
                stack.push(i);
                LogUtils.info("push to stack: %s", i.interpret());
            }
        }
        LogUtils.info("result: %s", stack.pop().interpret().getValue());
    }

    public static boolean isComparator(String s) {
        return s.equals(">") || s.equals("<") || s.equals(">=") || s.equals("<=") || s.equals("==");
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static boolean isLogicalOperator(String s) {
        return s.equals("&&") || s.equals("||");
    }

    public static Expression getComparatorInstance(String s, NumberExpression left, NumberExpression right) {
        switch (s) {
            case ">":
                return new GtExpression(left, right);
            case "<":
                return new LtExpression(left, right);
            case ">=":
                return new GtEqExpression(left, right);
            case "<=":
                return new LtEqExpression(left, right);
            case "==":
                return new EqEqExpression(left, right);
            default:
                return new EqEqExpression(left, right);
        }
    }

    public static Expression getOperatorInstance(String s, NumberExpression left, NumberExpression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
            default:
                return new MultiplyExpression(left, right);
        }
    }

    public static Expression getLogicalOperatorInstance(String s, BooleanExpression left, BooleanExpression right) {
        switch (s) {
            case "||":
                return new OrExpression(left, right);
            case "&&":
                return new AndExpression(left, right);
            default:
                return new AndExpression(left, right);
        }
    }
}
