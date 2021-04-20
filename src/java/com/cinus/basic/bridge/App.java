package com.cinus.basic.bridge;

public class App {
    public static void main(String[] args) {
        AutomaticWeapon automaticGuidanceWeapon = new AutomaticWeapon(new Automatic[]{new AutomaticGuidance()});
        automaticGuidanceWeapon.fire();
    }
}
