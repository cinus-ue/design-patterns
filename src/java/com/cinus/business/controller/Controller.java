package com.cinus.business.controller;

public class Controller {

    private Dispatcher dispatcher = new Dispatcher();

    public Controller() {
        dispatcher.register(new HomeView());
    }

    private boolean isAuthenticated(String request) {
        return true;
    }

    private void track(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatch(String request) {
        track(request);
        if (isAuthenticated(request)) {
            dispatcher.dispatch(request);
        }
    }
}
