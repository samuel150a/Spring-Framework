package com.sam.task;

public class Strength extends Glucose34 {
    public Strength() {
        System.out.println("Running in the Strength constructor");
    }

    @Override
    public void provideEnergy() {
        System.out.println("Running in the public method provideEnergy after implementation");
    }

    public void buildMuscle() {
        System.out.println("Running in the public method buildMuscle");
    }

    public void improveStamina() {
        System.out.println("Running in the public method improveStamina");
    }
}
