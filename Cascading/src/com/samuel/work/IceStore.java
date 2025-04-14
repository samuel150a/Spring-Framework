package com.samuel.work;

public class IceStore {
    public IceStore() {
        System.out.println("Running the IceStore constructor");
    }

    public void show(Ice86 ice) {
        if (ice != null) {
            ice.freeze();
            if (ice instanceof FrozenIce86) {
                FrozenIce86 ref = (FrozenIce86) ice;
                ref.flavor();
            } else {
                System.out.println("Ice86 is not an instance of FrozenIce86, cannot call cascaded method");
            }
        } else {
            System.out.println("Ice86 is null");
        }
    }
}
