package com.sam.task;

public class Flow extends River67 {
    public Flow() {
        System.out.println("Running in the Flow constructor");
    }

    @Override
    public void stream() {
        System.out.println("Running in the overridden method stream from Flow");
    }

    public void flood() {
        System.out.println("Running in the public method flood");
    }

    public void ripple() {
        System.out.println("Running in the public method ripple");
    }
}
