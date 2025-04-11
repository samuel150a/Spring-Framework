package com.sam.task;

public class Travel extends Bus33 {
    public Travel() {
        System.out.println("Running in the Travel constructor");
    }

    @Override
    public void move() {
        System.out.println("Running in the public method move after implementation");
    }

    public void startJourney() {
        System.out.println("Running in the public method startJourney");
    }

    public void stopJourney() {
        System.out.println("Running in the public method stopJourney");
    }
}
