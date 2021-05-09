package com.cinus.basic.chain;

import com.cinus.basic.chain.handler.AuthHandler;
import com.cinus.basic.chain.handler.ByeHandler;
import com.cinus.basic.chain.handler.NotifyHandler;

public class App {

    public static void main(String[] args) throws Exception {
        HandlerChain chain = new HandlerChain();
        chain.addFirst(new AuthHandler());
        chain.addLast(new NotifyHandler());
        chain.addLast(new ByeHandler());

        chain.processRequest(new Request(Request.RequestType.AUTH, " auth"));
        chain.processRequest(new Request(Request.RequestType.NOTIFY, " notify"));
        chain.processRequest(new Request(Request.RequestType.BYE, " bye"));
    }
}
