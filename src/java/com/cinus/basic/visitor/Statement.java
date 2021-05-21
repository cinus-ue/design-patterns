package com.cinus.basic.visitor;

public interface Statement {
    void accept(Visitor visitor);
}
