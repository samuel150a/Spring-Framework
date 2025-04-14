package com.samuel.work;

public class FitnessWatch57 extends SmartWatch57 {
    public FitnessWatch57() {
        System.out.println("Running in the FitnessWatch57 constructor");
    }

    @Override
    public void showTime() {
        System.out.println("Running public method showTime by child class");
    }

    public void trackFitness() {
        System.out.println("Running in public method trackFitness");
    }
}
