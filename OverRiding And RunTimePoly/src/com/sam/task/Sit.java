package com.sam.task;

public class Sit extends Chair70 {
    public Sit() {
        System.out.println("Running in the Sit constructor");
    }

    @Override
    public void support() {
        System.out.println("Running in the overridden method support from Sit");
    }

    public void leanBack() {
        System.out.println("Running in the public method leanBack");
    }

    public void fold() {
        System.out.println("Running in the public method fold");
    }
}
