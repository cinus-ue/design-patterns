package com.cinus.basic.visitor.statement;

import com.cinus.basic.visitor.Statement;
import com.cinus.basic.visitor.Visitor;

public class Update implements Statement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
