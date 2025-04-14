package com.samuel.work;

public class RunnerConditioner78 {
    public static void main(String[] args) {
        Conditioner78 conditioner = new Conditioner78();
        conditioner.apply(); // PARENT CLASS METHOD

        Conditioner78 silkConditioner = new SilkConditioner78();
        silkConditioner.apply(); // RUNTIME POLYMORPHISM

        SilkConditioner78 sc = new SilkConditioner78();
        sc.apply(); // CHILD CLASS METHOD
        sc.smoothen();

        ConditionerStore store = new ConditionerStore();
        store.show(conditioner);
        store.show(sc);
    }
}
