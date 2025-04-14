package com.samuel.work;

public class JetpackStore {
    public JetpackStore() {
        System.out.println("Running the JetpackStore constructor");
    }

    public void show(Jetpack18 jetpack) {
        if (jetpack != null) {
            jetpack.fly();
            if (jetpack instanceof AdvancedJetpack18) {
                AdvancedJetpack18 ref = (AdvancedJetpack18) jetpack;
                ref.activateBoost();
            } else {
                System.out.println("Jetpack18 is not an instance of AdvancedJetpack18, cannot call cascaded method");
            }
        } else {
            System.out.println("Jetpack18 is null");
        }
    }
}
