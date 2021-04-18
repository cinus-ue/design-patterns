package com.cinus.basic.visitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : parts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
