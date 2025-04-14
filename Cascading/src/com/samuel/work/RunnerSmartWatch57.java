package com.samuel.work;

public class RunnerSmartWatch57 {
    public static void main(String[] args) {
        SmartWatch57 watch = new SmartWatch57();
        watch.showTime(); // PARENT CLASS METHOD

        SmartWatch57 fitnessWatch = new FitnessWatch57();
        fitnessWatch.showTime(); // RUNTIME POLYMORPHISM

        FitnessWatch57 fitness = new FitnessWatch57();
        fitness.showTime(); // CHILD CLASS METHOD
        fitness.trackFitness();

        WatchStation station = new WatchStation();
        station.show(watch);
        station.show(fitness);
    }
}
