package com.sam.task;

public class RunnerOcean85 {
    public static void main(String[] args) {
        Ocean85 ocean = new Ocean85();
        ocean.showDepth();

        Ocean85 o = new Wave();
        o.showDepth();

        Wave wave = new Wave();
        wave.crashOnShore();
        wave.riseHigh();
    }
}
