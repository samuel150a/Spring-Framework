package com.sam.task;

public class RunnerMountain86 {
    public static void main(String[] args) {
        Mountain86 mountain = new Mountain86();
        mountain.standTall();

        Mountain86 m = new Climb();
        m.standTall();

        Climb climb = new Climb();
        climb.startClimbing();
        climb.reachSummit();
    }
}
