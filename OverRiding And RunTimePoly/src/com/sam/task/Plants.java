package com.sam.task;

public class Plants extends Sun29 {
    public Plants() {
        System.out.println("Running in the Plants constructor");
    }

    @Override
    public void shine() {
        System.out.println("Running in the public method shine after implementation");
    }

    public void grow() {
        System.out.println("Running in the public method grow");
    }

    public void photosynthesize() {
        System.out.println("Running in the public method photosynthesize");
    }
}
