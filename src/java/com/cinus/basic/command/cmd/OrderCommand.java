package com.cinus.basic.command.cmd;

import com.cinus.basic.command.Receiver;

public class OrderCommand implements Command {
    @Override
    public void Excute(Receiver receiver) {
        receiver.action("create order");
    }
}
