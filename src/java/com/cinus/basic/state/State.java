package com.cinus.basic.state;

import java.util.List;

public interface State {

    void doAction(List<Trader> traders);

}
