package com.cinus.business.filterchain;

import com.cinus.business.controller.Controller;
import com.cinus.business.filterchain.filter.AuthenticationFilter;
import com.cinus.business.filterchain.filter.LoggingFilter;

public class Server {

    private Controller controller;
    private FilterManager filterManager;

    public Server() {
        this.controller = new Controller();
        this.filterManager = new FilterManager();
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new LoggingFilter());
    }

    public void receive(String request) {
        filterManager.filter(request);
        controller.dispatch(request);
    }
}
