package com.samuel.work;

public class ChargingStation {
    public ChargingStation() {
        System.out.println("Running the ChargingStation constructor");
    }

    public void show(Charger63 charger) {
        if (charger != null) {
            charger.charge();
            if (charger instanceof FastCharger63) {
                FastCharger63 ref = (FastCharger63) charger;
                ref.quickBoost();
            } else {
                System.out.println("Charger63 is not an instance of FastCharger63, cannot call cascaded method");
            }
        } else {
            System.out.println("Charger63 is null");
        }
    }
}
