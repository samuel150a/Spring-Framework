package com.sam.task;

public class RunnerBus33 {
    public static void main(String[] args) {
        Bus33 bus = new Bus33();
        bus.move();

        Bus33 b = new Travel();
        b.move();

        Travel travel = new Travel();
        travel.startJourney();
        travel.stopJourney();
    }
}
