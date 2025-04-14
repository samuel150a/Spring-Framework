package com.samuel.work;

public class RunnerToothbrush80 {
    public static void main(String[] args) {
        Toothbrush80 toothbrush = new Toothbrush80();
        toothbrush.brush(); // PARENT CLASS METHOD

        Toothbrush80 electricToothbrush = new ElectricToothbrush80();
        electricToothbrush.brush(); // RUNTIME POLYMORPHISM

        ElectricToothbrush80 etb = new ElectricToothbrush80();
        etb.brush(); // CHILD CLASS METHOD
        etb.charge();

        ToothbrushStore store = new ToothbrushStore();
        store.show(toothbrush);
        store.show(etb);
    }
}
