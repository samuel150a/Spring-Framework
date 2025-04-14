package com.samuel.work;

public class Armory {
    public Armory() {
        System.out.println("Running the Armory constructor");
    }

    public void show(LaserGun19 gun) {
        if (gun != null) {
            gun.shoot();
            if (gun instanceof UltraLaserGun19) {
                UltraLaserGun19 ref = (UltraLaserGun19) gun;
                ref.chargePlasma();
            } else {
                System.out.println("LaserGun19 is not an instance of UltraLaserGun19, cannot call cascaded method");
            }
        } else {
            System.out.println("LaserGun19 is null");
        }
    }
}
