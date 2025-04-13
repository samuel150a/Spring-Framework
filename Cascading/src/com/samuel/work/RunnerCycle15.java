package com.samuel.work;

public class RunnerCycle15 {
    public static void main(String[] args) {
        Cycle15 cycle = new Cycle15();
        cycle.ride(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Cycle15 gearCycle = new GearCycle15();
        gearCycle.ride(); // RUNTIME POLYMORPHISM

        GearCycle15 gc15 = new GearCycle15();
        gc15.ride(); // NORMALLY ACCESSING CHILD CLASS METHOD
        gc15.shiftGear();

        CycleShop shop = new CycleShop();
        shop.show(cycle);
        shop.show(gc15);
    }
}
