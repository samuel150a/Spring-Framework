package com.sam.task;

public class RunnerBottle76 {
    public static void main(String[] args) {
        Bottle76 bottle = new Bottle76();
        bottle.openCap();

        Bottle76 b = new Pour();
        b.openCap();

        Pour pour = new Pour();
        pour.pourWater();
        pour.refill();
    }
}
