package com.cinus.basic.chain;

public abstract class RequestHandler {

    private RequestHandler next;

    public void setNext(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }

    @Override
    public abstract String toString();
}
