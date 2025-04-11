package com.sam.task;

public class RunnerCylinder32 {
    public static void main(String[] args) {
        Cylinder32 cylinder = new Cylinder32();
        cylinder.storeGas();

        Cylinder32 c = new Fire();
        c.storeGas();

        Fire fire = new Fire();
        fire.ignite();
        fire.spread();
    }
}
