package com.samuel.work;

public class RoffStore {
    public RoffStore() {
        System.out.println("Running the RoffStore constructor");
    }

    public void show(Roff95 roff) {
        if (roff != null) {
            roff.use();
            if (roff instanceof ElectricRoff95) {
                ElectricRoff95 ref = (ElectricRoff95) roff;
                ref.charge();
            } else {
                System.out.println("Roff95 is not an instance of ElectricRoff95, cannot call cascaded method");
            }
        } else {
            System.out.println("Roff95 is null");
        }
    }
}
