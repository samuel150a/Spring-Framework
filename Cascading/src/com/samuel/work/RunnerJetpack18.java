package com.samuel.work;

public class RunnerJetpack18 {
    public static void main(String[] args) {
        Jetpack18 jetpack = new Jetpack18();
        jetpack.fly(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Jetpack18 advancedJetpack = new AdvancedJetpack18();
        advancedJetpack.fly(); // RUNTIME POLYMORPHISM

        AdvancedJetpack18 aj18 = new AdvancedJetpack18();
        aj18.fly(); // NORMALLY ACCESSING CHILD CLASS METHOD
        aj18.activateBoost();

        JetpackStore store = new JetpackStore();
        store.show(jetpack);
        store.show(aj18);
    }
}
