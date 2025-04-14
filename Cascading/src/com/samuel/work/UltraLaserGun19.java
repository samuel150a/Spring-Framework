package com.samuel.work;

public class UltraLaserGun19 extends LaserGun19 {
    public UltraLaserGun19() {
        System.out.println("Running in the UltraLaserGun19 constructor");
    }

    @Override
    public void shoot() {
        System.out.println("Running public method shoot by child class");
    }

    public void chargePlasma() {
        System.out.println("Running in public method chargePlasma");
    }
}
