package com.sam.task;

public class RunnerLeg52 {
    public static void main(String[] args) {
        Leg52 leg = new Leg52();
        leg.move();

        Leg52 l = new Walk();
        l.move();

        Walk walk = new Walk();
        walk.step();
        walk.run();
    }
}
