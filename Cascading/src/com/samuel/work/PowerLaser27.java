package com.samuel.work;

public class PowerLaser27 extends Laser27 {
    public PowerLaser27() {
        System.out.println("Running in the PowerLaser27 constructor");
    }

    @Override
    public void emit() {
        System.out.println("Running public method emit by child class");
    }

    public void cutMetal() {
        System.out.println("Running in public method cutMetal");
    }
}
