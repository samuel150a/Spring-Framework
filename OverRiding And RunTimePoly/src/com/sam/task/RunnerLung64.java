package com.sam.task;

public class RunnerLung64 {
    public static void main(String[] args) {
        Lung64 lung = new Lung64();
        lung.inhale();

        Lung64 l = new Breathe();
        l.inhale();

        Breathe breathe = new Breathe();
        breathe.exhale();
        breathe.holdBreath();
    }
}
