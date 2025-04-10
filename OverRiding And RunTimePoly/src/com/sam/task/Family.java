package com.sam.task;

public class Family extends House15 {
    public Family() {
        System.out.println("Running in the Family constructor");
    }

    @Override
    public void shelter() {
        System.out.println("Running in the public method shelter after implementation");
    }

    public void love() {
        System.out.println("Running in the public method love");
    }

    public void care() {
        System.out.println("Running in the public method care");
    }
}
