package com.sam.task;

public class RunnerLight60 {
    public static void main(String[] args) {
        Light60 light = new Light60();
        light.shine();

        Light60 l = new Glow();
        l.shine();

        Glow glow = new Glow();
        glow.dim();
        glow.flicker();
    }
}
