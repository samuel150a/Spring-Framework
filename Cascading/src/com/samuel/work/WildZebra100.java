package com.samuel.work;

public class WildZebra100 extends Zebra100 {
    public WildZebra100() {
        System.out.println("Running in the WildZebra100 constructor");
    }

    @Override
    public void run() {
        System.out.println("Running public method run by child class");
    }

    public void graze() {
        System.out.println("Running in public method graze");
    }
}
