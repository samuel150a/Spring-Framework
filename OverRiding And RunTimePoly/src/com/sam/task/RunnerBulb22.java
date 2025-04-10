package com.sam.task;

public class RunnerBulb22 {
    public static void main(String[] args) {
        Bulb22 bulb = new Bulb22();
        bulb.glow();

        Bulb22 b = new Light();
        b.glow();

        Light light = new Light();
        light.brighten();
        light.powerConsume();
    }
}
