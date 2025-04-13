package com.samuel.work;

public class GamingLaptop11 extends Laptop11 {
    public GamingLaptop11() {
        System.out.println("Running in the GamingLaptop11 constructor");
    }

    @Override
    public void open() {
        System.out.println("Running public method open by child class");
    }

    public void playGame() {
        System.out.println("Running in public method playGame");
    }
}
