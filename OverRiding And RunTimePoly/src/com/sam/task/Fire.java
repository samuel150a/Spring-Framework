package com.sam.task;

public class Fire extends Cylinder32 {
    public Fire() {
        System.out.println("Running in the Fire constructor");
    }

    @Override
    public void storeGas() {
        System.out.println("Running in the public method storeGas after implementation");
    }

    public void ignite() {
        System.out.println("Running in the public method ignite");
    }

    public void spread() {
        System.out.println("Running in the public method spread");
    }
}
