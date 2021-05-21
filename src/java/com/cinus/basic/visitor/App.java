package com.cinus.basic.visitor;

public class App {

    public static void main(String[] args) {
        Script script = new Script();
        script.accept(new ExecuteVisitor());
    }

}
