package com.samuel.work;

public class ColorTape28 extends CelloTape28 {
    public ColorTape28() {
        System.out.println("Running in the ColorTape28 constructor");
    }

    @Override
    public void stick() {
        System.out.println("Running public method stick by child class");
    }

    public void decorate() {
        System.out.println("Running in public method decorate");
    }
}
