package com.cinus.business.controller;

public class HomeView implements View {
    @Override
    public String name() {
        return "home";
    }

    @Override
    public void show() {
        System.out.println("Displaying Home Page");
    }
}
