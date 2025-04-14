package com.samuel.work;

public class iPadPro48 extends iPad48 {
    public iPadPro48() {
        System.out.println("Running in the iPadPro48 constructor");
    }

    @Override
    public void browse() {
        System.out.println("Running public method browse by child class");
    }

    public void drawWithPencil() {
        System.out.println("Running in public method drawWithPencil");
    }
}
