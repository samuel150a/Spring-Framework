package com.sam.task;

public class Voice extends Ear51 {
    public Voice() {
        System.out.println("Running in the Voice constructor");
    }

    @Override
    public void receiveSound() {
        System.out.println("Running in the overridden method receiveSound from Voice");
    }

    public void speak() {
        System.out.println("Running in the public method speak");
    }

    public void mute() {
        System.out.println("Running in the public method mute");
    }
}
