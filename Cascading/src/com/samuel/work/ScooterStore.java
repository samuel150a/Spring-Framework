package com.samuel.work;

public class ScooterStore {
    public ScooterStore() {
        System.out.println("Running the ScooterStore constructor");
    }

    public void show(Scooter88 scooter) {
        if (scooter != null) {
            scooter.ride();
            if (scooter instanceof ElectricScooter88) {
                ElectricScooter88 ref = (ElectricScooter88) scooter;
                ref.charge();
            } else {
                System.out.println("Scooter88 is not an instance of ElectricScooter88, cannot call cascaded method");
            }
        } else {
            System.out.println("Scooter88 is null");
        }
    }
}
