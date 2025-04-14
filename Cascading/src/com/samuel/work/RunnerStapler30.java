package com.samuel.work;

public class RunnerStapler30 {
    public static void main(String[] args) {
        Stapler30 stapler = new Stapler30();
        stapler.staple(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Stapler30 electricStapler = new ElectricStapler30();
        electricStapler.staple(); // RUNTIME POLYMORPHISM

        ElectricStapler30 es30 = new ElectricStapler30();
        es30.staple(); // NORMALLY ACCESSING CHILD CLASS METHOD
        es30.autoStaple();

        StaplerWorkshop workshop = new StaplerWorkshop();
        workshop.show(stapler);
        workshop.show(es30);
    }
}
