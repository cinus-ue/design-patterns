package com.cinus.business.filterchain;

public class App {

    public static void main(String[] args) {
        Server server = new Server();
        server.init();
        server.receive("home");

        server.disableFilter();
        server.receive("home");
    }

}
