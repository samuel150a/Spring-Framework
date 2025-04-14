package com.samuel.work;

public class RunnerLaser27 {
    public static void main(String[] args) {
        Laser27 laser = new Laser27();
        laser.emit(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Laser27 powerLaser = new PowerLaser27();
        powerLaser.emit(); // RUNTIME POLYMORPHISM

        PowerLaser27 pl27 = new PowerLaser27();
        pl27.emit(); // NORMALLY ACCESSING CHILD CLASS METHOD
        pl27.cutMetal();

        LaserLab lab = new LaserLab();
        lab.show(laser);
        lab.show(pl27);
    }
}
