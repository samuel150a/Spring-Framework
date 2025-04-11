package com.sam.task;

public class RunnerGlucose34 {
    public static void main(String[] args) {
        Glucose34 glucose = new Glucose34();
        glucose.provideEnergy();

        Glucose34 g = new Strength();
        g.provideEnergy();

        Strength strength = new Strength();
        strength.buildMuscle();
        strength.improveStamina();
    }
}
