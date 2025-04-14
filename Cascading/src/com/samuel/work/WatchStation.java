package com.samuel.work;

public class WatchStation {
    public WatchStation() {
        System.out.println("Running the WatchStation constructor");
    }

    public void show(SmartWatch57 watch) {
        if (watch != null) {
            watch.showTime();
            if (watch instanceof FitnessWatch57) {
                FitnessWatch57 ref = (FitnessWatch57) watch;
                ref.trackFitness();
            } else {
                System.out.println("SmartWatch57 is not an instance of FitnessWatch57, cannot call cascaded method");
            }
        } else {
            System.out.println("SmartWatch57 is null");
        }
    }
}
