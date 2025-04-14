package com.samuel.work;

public class RunnerCharger63 {
    public static void main(String[] args) {
        Charger63 charger = new Charger63();
        charger.charge(); // PARENT CLASS METHOD

        Charger63 fast = new FastCharger63();
        fast.charge(); // RUNTIME POLYMORPHISM

        FastCharger63 fc = new FastCharger63();
        fc.charge(); // CHILD CLASS METHOD
        fc.quickBoost();

        ChargingStation station = new ChargingStation();
        station.show(charger);
        station.show(fc);
    }
}
