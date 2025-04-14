package com.samuel.work;

public class ColorPencil31 extends Pencil31 {
    public ColorPencil31() {
        System.out.println("Running in the ColorPencil31 constructor");
    }

    @Override
    public void write() {
        System.out.println("Running public method write by child class");
    }

    public void draw() {
        System.out.println("Running in public method draw");
    }
}
