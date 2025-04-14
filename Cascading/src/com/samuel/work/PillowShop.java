package com.samuel.work;

public class PillowShop {
    public PillowShop() {
        System.out.println("Running the PillowShop constructor");
    }

    public void show(Pillow74 pillow) {
        if (pillow != null) {
            pillow.use();
            if (pillow instanceof SoftPillow74) {
                SoftPillow74 ref = (SoftPillow74) pillow;
                ref.fluff();
            } else {
                System.out.println("Pillow74 is not an instance of SoftPillow74, cannot call cascaded method");
            }
        } else {
            System.out.println("Pillow74 is null");
        }
    }
}
