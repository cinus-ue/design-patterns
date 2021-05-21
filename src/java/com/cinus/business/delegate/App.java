package com.cinus.business.delegate;

public class App {

    public static void main(String[] args) {
        Client client = new Client(new BusinessDelegate(ServiceType.HTTP));
        client.doTask();
    }

}
