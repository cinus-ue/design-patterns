package com.cinus.basic.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
