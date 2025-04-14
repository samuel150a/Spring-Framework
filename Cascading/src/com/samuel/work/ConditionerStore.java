package com.samuel.work;

public class ConditionerStore {
    public ConditionerStore() {
        System.out.println("Running the ConditionerStore constructor");
    }

    public void show(Conditioner78 conditioner) {
        if (conditioner != null) {
            conditioner.apply();
            if (conditioner instanceof SilkConditioner78) {
                SilkConditioner78 ref = (SilkConditioner78) conditioner;
                ref.smoothen();
            } else {
                System.out.println("Conditioner78 is not an instance of SilkConditioner78, cannot call cascaded method");
            }
        } else {
            System.out.println("Conditioner78 is null");
        }
    }
}
