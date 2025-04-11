package com.sam.task;

public class Breathe extends Lung64 {
    public Breathe() {
        System.out.println("Running in the Breathe constructor");
    }

    @Override
    public void inhale() {
        System.out.println("Running in the overridden method inhale from Breathe");
    }

    public void exhale() {
        System.out.println("Running in the public method exhale");
    }

    public void holdBreath() {
        System.out.println("Running in the public method holdBreath");
    }
}
