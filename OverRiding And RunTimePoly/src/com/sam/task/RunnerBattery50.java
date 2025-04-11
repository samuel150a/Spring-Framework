package com.sam.task;

public class RunnerBattery50 {
    public static void main(String[] args) {
        Battery50 battery = new Battery50();
        battery.storePower();

        Battery50 b = new Charge();
        b.storePower();

        Charge charge = new Charge();
        charge.fill();
        charge.supply();
    }
}
