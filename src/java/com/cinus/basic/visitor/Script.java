package com.cinus.basic.visitor;

import com.cinus.basic.visitor.statement.Delete;
import com.cinus.basic.visitor.statement.Insert;
import com.cinus.basic.visitor.statement.Update;

public class Script implements Statement {

    Statement[] statements;

    public Script() {
        statements = new Statement[]{new Insert(), new Update(), new Delete()};
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Statement statement : statements) {
            statement.accept(visitor);
        }
    }
}
