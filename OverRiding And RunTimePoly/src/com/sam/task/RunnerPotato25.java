package com.sam.task;

public class RunnerPotato25 {
    public static void main(String[] args) {
        Potato25 potato = new Potato25();
        potato.grow();

        Potato25 p = new Lays();
        p.grow();

        Lays lays = new Lays();
        lays.pack();
        lays.flavor();
    }
}
