package com.cinus.basic.nullobject;

public class App {

    public static void main(String[] args) {

        Node root =
                new NodeImpl("1", new NodeImpl("0", new NodeImpl("-1", NullNode.getInstance(),
                        NullNode.getInstance()), NullNode.getInstance()), new NodeImpl("2",
                        NullNode.getInstance(), new NodeImpl("1", NullNode.getInstance(),
                        NullNode.getInstance())));

        root.walk();
    }
}
