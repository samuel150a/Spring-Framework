package com.samuel.work;

public class GamingMouse50 extends Mouse50 {
    public GamingMouse50() {
        System.out.println("Running in the GamingMouse50 constructor");
    }

    @Override
    public void click() {
        System.out.println("Running public method click by child class");
    }

    public void rgbGlow() {
        System.out.println("Running in public method rgbGlow");
    }
}
