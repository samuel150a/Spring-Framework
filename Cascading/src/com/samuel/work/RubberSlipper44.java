package com.samuel.work;

public class RubberSlipper44 extends Slipper44 {
    public RubberSlipper44() {
        System.out.println("Running in the RubberSlipper44 constructor");
    }

    @Override
    public void wear() {
        System.out.println("Running public method wear by child class");
    }

    public void wash() {
        System.out.println("Running in public method wash");
    }
}
