package com.sam.task;

public class Write1 extends Pen71 {
    public Write1() {
        System.out.println("Running in the Write constructor");
    }

    @Override
    public void openCap() {
        System.out.println("Running in the overridden method openCap from Write");
    }

    public void drawLine() {
        System.out.println("Running in the public method drawLine");
    }

    public void signName() {
        System.out.println("Running in the public method signName");
    }
}
