package com.samuel.work;

public class LaserLab {
    public LaserLab() {
        System.out.println("Running the LaserLab constructor");
    }

    public void show(Laser27 laser) {
        if (laser != null) {
            laser.emit();
            if (laser instanceof PowerLaser27) {
                PowerLaser27 ref = (PowerLaser27) laser;
                ref.cutMetal();
            } else {
                System.out.println("Laser27 is not an instance of PowerLaser27, cannot call cascaded method");
            }
        } else {
            System.out.println("Laser27 is null");
        }
    }
}
