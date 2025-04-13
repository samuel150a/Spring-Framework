package com.samuel.work;

public class BellShop {
    public BellShop() {
        System.out.println("Running the BellShop constructor");
    }

    public void show(Bell3 bell) {
        if (bell != null) {
            bell.ringBell();
            if (bell instanceof ElectricBell3) {
                ElectricBell3 ref = (ElectricBell3) bell;
                ref.chargeBattery();
            } else {
                System.out.println("Bell3 is not an instance of ElectricBell3, cannot call cascaded method");
            }
        } else {
            System.out.println("Bell3 is null");
        }
    }
}
