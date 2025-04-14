package com.samuel.work;

public class RingBinder32 extends Binder32 {
    public RingBinder32() {
        System.out.println("Running in the RingBinder32 constructor");
    }

    @Override
    public void organize() {
        System.out.println("Running public method organize by child class");
    }

    public void addPages() {
        System.out.println("Running in public method addPages");
    }
}
