package com.sam.task;

public class Grip extends Hand53 {
    public Grip() {
        System.out.println("Running in the Grip constructor");
    }

    @Override
    public void hold() {
        System.out.println("Running in the overridden method hold from Grip");
    }

    public void catchItem() {
        System.out.println("Running in the public method catchItem");
    }

    public void releaseItem() {
        System.out.println("Running in the public method releaseItem");
    }
}
