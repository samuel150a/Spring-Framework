package com.sam.task;

public class Work extends Hand37 {
    public Work() {
        System.out.println("Running in the Work constructor");
    }

    @Override
    public void lift() {
        System.out.println("Running in the public method lift after implementation");
    }

    public void write() {
        System.out.println("Running in the public method write");
    }

    public void build() {
        System.out.println("Running in the public method build");
    }
}
