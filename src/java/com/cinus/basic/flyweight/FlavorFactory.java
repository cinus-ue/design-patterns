package com.cinus.basic.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlavorFactory {

    private final Map<Flavor, FlavorCoffee> flavors;

    public FlavorFactory() {
        this.flavors = new HashMap<>();
    }

    public void addFlavor(Flavor flavor) {
        this.flavors.put(flavor, new FlavorCoffee(flavor.name()));
    }

    public String getOrder(Flavor flavor) {
        if (flavors.containsKey(flavor)) {
            return flavors.get(flavor).order();
        }
        return null;
    }
}
