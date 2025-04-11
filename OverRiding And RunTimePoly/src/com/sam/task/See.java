package com.sam.task;

public class See extends Eye54 {
    public See() {
        System.out.println("Running in the See constructor");
    }

    @Override
    public void view() {
        System.out.println("Running in the overridden method view from See");
    }

    public void focus() {
        System.out.println("Running in the public method focus");
    }

    public void blink() {
        System.out.println("Running in the public method blink");
    }
}
