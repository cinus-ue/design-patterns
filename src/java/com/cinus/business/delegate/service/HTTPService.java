package com.cinus.business.delegate.service;

public class HTTPService implements BusinessService {
    @Override
    public void processing() {
        System.out.println("Processing task by invoking HTTP Service");
    }
}
