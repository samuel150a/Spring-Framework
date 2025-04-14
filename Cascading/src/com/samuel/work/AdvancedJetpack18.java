package com.samuel.work;

public class AdvancedJetpack18 extends Jetpack18 {
    public AdvancedJetpack18() {
        System.out.println("Running in the AdvancedJetpack18 constructor");
    }

    @Override
    public void fly() {
        System.out.println("Running public method fly by child class");
    }

    public void activateBoost() {
        System.out.println("Running in public method activateBoost");
    }
}
