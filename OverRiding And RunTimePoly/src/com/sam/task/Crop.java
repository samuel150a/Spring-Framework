package com.sam.task;

public class Crop extends Farm97 {
    public Crop() {
        System.out.println("Running in the Crop constructor");
    }

    @Override
    public void cultivate() {
        System.out.println("Running in the overridden method cultivate from Crop");
    }

    public void water() {
        System.out.println("Running in the public method water");
    }

    public void harvest() {
        System.out.println("Running in the public method harvest");
    }
}
