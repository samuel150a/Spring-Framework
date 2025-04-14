package com.samuel.work;

public class ToothbrushStore {
    public ToothbrushStore() {
        System.out.println("Running the ToothbrushStore constructor");
    }

    public void show(Toothbrush80 toothbrush) {
        if (toothbrush != null) {
            toothbrush.brush();
            if (toothbrush instanceof ElectricToothbrush80) {
                ElectricToothbrush80 ref = (ElectricToothbrush80) toothbrush;
                ref.charge();
            } else {
                System.out.println("Toothbrush80 is not an instance of ElectricToothbrush80, cannot call cascaded method");
            }
        } else {
            System.out.println("Toothbrush80 is null");
        }
    }
}
