package com.sam.task;

public class Vision extends Eye38 {
    public Vision() {
        System.out.println("Running in the Vision constructor");
    }

    @Override
    public void see() {
        System.out.println("Running in the public method see after implementation");
    }

    public void focus() {
        System.out.println("Running in the public method focus");
    }

    public void observe() {
        System.out.println("Running in the public method observe");
    }
}
