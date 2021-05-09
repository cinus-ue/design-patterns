package com.cinus.basic.command;

import com.cinus.basic.command.cmd.OrderCommand;
import com.cinus.basic.command.cmd.StockCommand;

public class App {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        new Invoker().addCommand(new OrderCommand()).addCommand(new StockCommand())
                .excute(receiver);
    }
}
