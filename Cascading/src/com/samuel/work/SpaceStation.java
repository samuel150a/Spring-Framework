package com.samuel.work;

public class SpaceStation {
    public SpaceStation() {
        System.out.println("Running the SpaceStation constructor");
    }

    public void show(Spaceship17 spaceship) {
        if (spaceship != null) {
            spaceship.fly();
            if (spaceship instanceof AdvancedSpaceship17) {
                AdvancedSpaceship17 ref = (AdvancedSpaceship17) spaceship;
                ref.engageHyperdrive();
            } else {
                System.out.println("Spaceship17 is not an instance of AdvancedSpaceship17, cannot call cascaded method");
            }
        } else {
            System.out.println("Spaceship17 is null");
        }
    }
}
