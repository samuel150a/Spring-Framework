package com.sam.task;

public class RunnerFan48 {
    public static void main(String[] args) {
        Fan48 fan = new Fan48();
        fan.rotate();

        Fan48 f = new Air();
        f.rotate();

        Air air = new Air();
        air.cool();
        air.circulate();
    }
}
