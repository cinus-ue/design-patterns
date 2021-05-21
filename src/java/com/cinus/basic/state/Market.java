package com.cinus.basic.state;

import java.util.LinkedList;
import java.util.List;

public class Market {

    private static final String openingTime = "9:00";
    private static final String closingTime = "15:00";


    private String time;
    private List<Trader> traders = new LinkedList<>();
    private State state;

    public void into(Trader trader) {
        this.traders.add(trader);
    }

    public void setTime(String time) {
        this.time = time;
        if (openingTime.equals(time)) {
            changeState(new OpeningState());
        } else if (closingTime.equals(time)) {
            changeState(new ClosingState());
        }
    }

    private void changeState(State state) {
        this.state = state;
        state.doAction(traders);
    }


}
