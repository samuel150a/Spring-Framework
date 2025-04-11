package com.sam.task;

public class Rain1 extends Clouds84 {
    public Rain1() {
        System.out.println("Running in the Rain constructor");
    }

    @Override
    public void floatInSky() {
        System.out.println("Running in the overridden method floatInSky from Rain");
    }

    public void startDrizzle() {
        System.out.println("Running in the public method startDrizzle");
    }

    public void pourHeavyRain() {
        System.out.println("Running in the public method pourHeavyRain");
    }
}
