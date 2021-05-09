package com.cinus.basic.chain;

public class HandlerChain {

    private RequestHandler head;
    private RequestHandler tail;

    private boolean init(RequestHandler handler) {
        if (this.head == null && this.tail == null) {
            this.head = handler;
            this.tail = handler;
            return true;
        }
        return false;
    }

    public void addFirst(RequestHandler handler) {
        if (init(handler)) return;
        handler.setNext(this.head);
        this.head = handler;
    }

    public void addLast(RequestHandler handler) {
        if (init(handler)) return;
        this.tail.setNext(handler);
        this.tail = handler;
    }

    public void processRequest(Request request) {
        this.head.handleRequest(request);
    }

}
