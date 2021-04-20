package com.cinus.basic.bridge;

public class AutomaticWeapon implements Weapon {
    private Automatic[] automatics;

    public AutomaticWeapon(Automatic[] automatics) {
        this.automatics = automatics;
    }

    @Override
    public void fire() {
        for (Automatic automatic:automatics) {
            automatic.autorun();
        }
    }
}
