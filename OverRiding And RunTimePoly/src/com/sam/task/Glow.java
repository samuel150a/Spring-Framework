package com.sam.task;

public class Glow extends Light60 {
    public Glow() {
        System.out.println("Running in the Glow constructor");
    }

    @Override
    public void shine() {
        System.out.println("Running in the overridden method shine from Glow");
    }

    public void dim() {
        System.out.println("Running in the public method dim");
    }

    public void flicker() {
        System.out.println("Running in the public method flicker");
    }
}
