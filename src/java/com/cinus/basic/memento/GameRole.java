package com.cinus.basic.memento;

public class GameRole {

    private int vitality;
    private int attack;
    private int defense;

    public void init() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight() {
        this.vitality -= 1;
        this.attack -= 1;
        this.defense -= 1;
    }

    public void display() {
        System.out.println(toString());
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GameRole{");
        sb.append("vitality=").append(vitality);
        sb.append(", attack=").append(attack);
        sb.append(", defense=").append(defense);
        sb.append('}');
        return sb.toString();
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vitality, attack, defense);
    }

    public void recovery(RoleStateMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

}
