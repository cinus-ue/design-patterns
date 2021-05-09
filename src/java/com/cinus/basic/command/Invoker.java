package com.cinus.basic.command;

import com.cinus.basic.command.cmd.Command;

import java.util.LinkedList;
import java.util.List;

public class Invoker {
    private List<Command> commands = new LinkedList<>();

    public Invoker addCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void excute(Receiver receiver) {
        for (Command command : commands) {
            command.Excute(receiver);
        }
    }
}
