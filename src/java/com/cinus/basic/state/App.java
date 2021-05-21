package com.cinus.basic.state;

public class App {

    public static void main(String[] args) {
        Market market = new Market();
        Trader seller = new Trader("Seller");
        Trader buyer = new Trader(" Buyer");
        market.into(seller);
        market.into(buyer);
        market.setTime("9:00");
        market.setTime("15:00");
    }

}
