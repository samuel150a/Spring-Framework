package com.sam.task;

public class Light extends Bulb22 {
    public Light() {
        System.out.println("Running in the Light constructor");
    }

    @Override
    public void glow() {
        System.out.println("Running in the public method glow after implementation");
    }

    public void brighten() {
        System.out.println("Running in the public method brighten");
    }

    public void powerConsume() {
        System.out.println("Running in the public method powerConsume");
    }
}
