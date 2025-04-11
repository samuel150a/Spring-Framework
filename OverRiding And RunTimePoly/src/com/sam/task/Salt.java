package com.sam.task;

public class Salt extends Sea31 {
    public Salt() {
        System.out.println("Running in the Salt constructor");
    }

    @Override
    public void wave() {
        System.out.println("Running in the public method wave after implementation");
    }

    public void extract() {
        System.out.println("Running in the public method extract");
    }

    public void pack() {
        System.out.println("Running in the public method pack");
    }
}
