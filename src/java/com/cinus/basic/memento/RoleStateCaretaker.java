package com.cinus.basic.memento;

import java.util.Stack;

public class RoleStateCaretaker {

    Stack<RoleStateMemento> states = new Stack<>();

    public void add(RoleStateMemento roleStateMemento) {
        states.push(roleStateMemento);
    }

    public RoleStateMemento get() {
        return states.pop();
    }
}
