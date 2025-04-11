package com.sam.task;

public class Air extends Fan48 {
    public Air() {
        System.out.println("Running in the Air constructor");
    }

    @Override
    public void rotate() {
        System.out.println("Running in the public method rotate after implementation");
    }

    public void cool() {
        System.out.println("Running in the public method cool");
    }

    public void circulate() {
        System.out.println("Running in the public method circulate");
    }
}
