package com.samuel.work;

public class StaplerWorkshop {
    public StaplerWorkshop() {
        System.out.println("Running the StaplerWorkshop constructor");
    }

    public void show(Stapler30 stapler) {
        if (stapler != null) {
            stapler.staple();
            if (stapler instanceof ElectricStapler30) {
                ElectricStapler30 ref = (ElectricStapler30) stapler;
                ref.autoStaple();
            } else {
                System.out.println("Stapler30 is not an instance of ElectricStapler30, cannot call cascaded method");
            }
        } else {
            System.out.println("Stapler30 is null");
        }
    }
}
