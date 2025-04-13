package com.samuel.work;

public class KitchenStore {
    public KitchenStore() {
        System.out.println("Running the KitchenStore constructor");
    }

    public void show(Microwave16 microwave) {
        if (microwave != null) {
            microwave.cook();
            if (microwave instanceof SmartMicrowave16) {
                SmartMicrowave16 ref = (SmartMicrowave16) microwave;
                ref.defrost();
            } else {
                System.out.println("Microwave16 is not an instance of SmartMicrowave16, cannot call cascaded method");
            }
        } else {
            System.out.println("Microwave16 is null");
        }
    }
}
