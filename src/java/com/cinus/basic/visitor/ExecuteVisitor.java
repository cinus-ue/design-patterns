package com.cinus.basic.visitor;

public class ExecuteVisitor implements Visitor {

    @Override
    public void visit(Statement statement) {
        System.out.println("Execute: " + statement.getClass().getSimpleName());
    }

}
