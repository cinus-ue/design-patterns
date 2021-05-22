package com.cinus.business.filterchain;

import com.cinus.business.controller.Controller;
import com.cinus.business.filterchain.filter.AuthenticationFilter;
import com.cinus.business.filterchain.filter.LoggingFilter;

public class Server {

    private Controller controller = new Controller();
    private FilterManager filterManager = new FilterManager();

    public void init() {
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new LoggingFilter());
    }

    public void disableFilter() {
        filterManager.disable();
    }


    public void receive(String request) {
        filterManager.filter(request);
        controller.dispatch(request);
    }
}
