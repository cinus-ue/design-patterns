package com.cinus.business.delegate.service;

public class RPCService implements BusinessService {
    @Override
    public void processing() {
        System.out.println("Processing task by invoking RPC Service");
    }
}
