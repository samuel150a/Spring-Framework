package com.samuel.work;

public class CeilingFan7 extends Fan7 {
    public CeilingFan7() {
        System.out.println("Running in the CeilingFan7 constructor");
    }

    @Override
    public void rotate() {
        System.out.println("Running public method rotate by child class");
    }

    public void controlSpeed() {
        System.out.println("Running in public method controlSpeed");
    }
}
