package com.samuel.work;

public class RunnerSpaceship17 {
    public static void main(String[] args) {
        Spaceship17 spaceship = new Spaceship17();
        spaceship.fly(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Spaceship17 advancedSpaceship = new AdvancedSpaceship17();
        advancedSpaceship.fly(); // RUNTIME POLYMORPHISM

        AdvancedSpaceship17 as17 = new AdvancedSpaceship17();
        as17.fly(); // NORMALLY ACCESSING CHILD CLASS METHOD
        as17.engageHyperdrive();

        SpaceStation station = new SpaceStation();
        station.show(spaceship);
        station.show(as17);
    }
}
