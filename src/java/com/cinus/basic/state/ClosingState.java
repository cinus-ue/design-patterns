package com.cinus.basic.state;

import java.util.List;

public class ClosingState implements State {

    @Override
    public void doAction(List<Trader> traders) {
        for (Trader trader : traders) {
            trader.stopTrading();
        }
    }

}
