package com.cinus.basic.strategy;

import com.cinus.util.LogUtils;

public class App {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        LogUtils.info("-1 + 2 = %d ", context.execute(-1, 2));
        LogUtils.info("1 + 2 = %d ", context.execute(1, 2));

        context.changeStrategy(new OperationSubtract());
        LogUtils.info("1 - 2 = %d", context.execute(1, 2));
        LogUtils.info("3 - 2 = %d", context.execute(3, 2));

        context.changeStrategy(new OperationMultiply());
        LogUtils.info("-1 * 2 = %d", context.execute(-1, 2));
        LogUtils.info("2 * 2 = %d", context.execute(2, 2));

        context.changeStrategy(((num1, num2) -> num1 / num2));
        LogUtils.info("-4 / 2 = %d", context.execute(-4, 2));
        LogUtils.info("4 / 2 = %d", context.execute(4, 2));

    }
}
