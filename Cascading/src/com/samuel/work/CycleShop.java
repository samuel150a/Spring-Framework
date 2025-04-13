package com.samuel.work;

public class CycleShop {
    public CycleShop() {
        System.out.println("Running the CycleShop constructor");
    }

    public void show(Cycle15 cycle) {
        if (cycle != null) {
            cycle.ride();
            if (cycle instanceof GearCycle15) {
                GearCycle15 ref = (GearCycle15) cycle;
                ref.shiftGear();
            } else {
                System.out.println("Cycle15 is not an instance of GearCycle15, cannot call cascaded method");
            }
        } else {
            System.out.println("Cycle15 is null");
        }
    }
}
