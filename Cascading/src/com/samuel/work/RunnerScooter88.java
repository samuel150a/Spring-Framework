package com.samuel.work;

public class RunnerScooter88 {
    public static void main(String[] args) {
        Scooter88 scooter = new Scooter88();
        scooter.ride(); // PARENT CLASS METHOD

        Scooter88 electricScooter = new ElectricScooter88();
        electricScooter.ride(); // RUNTIME POLYMORPHISM

        ElectricScooter88 es = new ElectricScooter88();
        es.ride(); // CHILD CLASS METHOD
        es.charge();

        ScooterStore store = new ScooterStore();
        store.show(scooter);
        store.show(es);
    }
}
