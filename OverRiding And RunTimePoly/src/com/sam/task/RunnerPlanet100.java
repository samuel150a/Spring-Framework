package com.sam.task;

public class RunnerPlanet100 {
    public static void main(String[] args) {
        Planet100 planet = new Planet100();
        planet.rotate();

        Planet100 p = new Alien();
        p.rotate();

        Alien alien = new Alien();
        alien.communicate();
        alien.explore();
    }
}
