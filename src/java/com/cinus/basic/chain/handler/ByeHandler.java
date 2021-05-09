package com.cinus.basic.chain.handler;

import com.cinus.basic.chain.Request;
import com.cinus.basic.chain.RequestHandler;

public class ByeHandler extends RequestHandler {

    @Override
    public void handleRequest(Request request) {
        if (Request.RequestType.BYE == request.getType()) {
            request.markHandled();
            System.out.println(toString() + request.getDesc());
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "ByeHandler:";
    }
}
