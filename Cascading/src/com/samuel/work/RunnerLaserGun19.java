package com.samuel.work;

public class RunnerLaserGun19 {
    public static void main(String[] args) {
        LaserGun19 gun = new LaserGun19();
        gun.shoot(); // NORMALLY ACCESSING PARENT CLASS METHOD

        LaserGun19 ultraGun = new UltraLaserGun19();
        ultraGun.shoot(); // RUNTIME POLYMORPHISM

        UltraLaserGun19 ulg19 = new UltraLaserGun19();
        ulg19.shoot(); // NORMALLY ACCESSING CHILD CLASS METHOD
        ulg19.chargePlasma();

        Armory armory = new Armory();
        armory.show(gun);
        armory.show(ulg19);
    }
}
