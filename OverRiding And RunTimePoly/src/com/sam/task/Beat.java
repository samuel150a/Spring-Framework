package com.sam.task;

public class Beat extends Heart62 {
    public Beat() {
        System.out.println("Running in the Beat constructor");
    }

    @Override
    public void pumpBlood() {
        System.out.println("Running in the overridden method pumpBlood from Beat");
    }

    public void beatFaster() {
        System.out.println("Running in the public method beatFaster");
    }

    public void beatSlower() {
        System.out.println("Running in the public method beatSlower");
    }
}
