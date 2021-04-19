package com.cinus.basic.builder;

public class App {

    public static void main(String[] args) {

        Computer macbookAir = new Computer.Builder("MacBook Air").memory("16GB").storage("2TB").display("13.3-inch display")
                .os("macOS").build();
        System.out.println(macbookAir.toString());
        Computer macbookPro = new Computer.Builder("MacBook Pro").memory("64GB").storage("8TB").display("16-inch display")
                .os("macOS").build();
        System.out.println(macbookPro.toString());

    }
}
