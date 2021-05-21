package com.cinus.basic.memento;

public class App {

    public static void main(String[] args) {
        GameRole player = new GameRole();
        player.init();
        player.display();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.add(player.saveState());

        player.fight();
        player.display();
        caretaker.add(player.saveState());


        player.fight();
        player.display();
        caretaker.add(player.saveState());


        System.out.println("recovering...");
        player.recovery(caretaker.get());
        player.display();
        player.recovery(caretaker.get());
        player.display();
        player.recovery(caretaker.get());
        player.display();


    }

}
