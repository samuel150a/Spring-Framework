package com.sam.task;

public class Turn extends Page78 {
    public Turn() {
        System.out.println("Running in the Turn constructor");
    }

    @Override
    public void showContent() {
        System.out.println("Running in the overridden method showContent from Turn");
    }

    public void flipForward() {
        System.out.println("Running in the public method flipForward");
    }

    public void flipBackward() {
        System.out.println("Running in the public method flipBackward");
    }
}
