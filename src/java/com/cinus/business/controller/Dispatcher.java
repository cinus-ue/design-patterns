package com.cinus.business.controller;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {

    Map<String, View> views = new HashMap<>();

    public void register(View view) {
        views.put(view.name(), view);
    }

    public void dispatch(String request) {
        if (views.containsKey(request)) {
            views.get(request).show();
            return;
        }
        throw new IllegalArgumentException("Unhandled request:" + request);
    }
}
