package com.sam.task;

public class RunnerTree43 {
    public static void main(String[] args) {
        Tree43 tree = new Tree43();
        tree.grow();

        Tree43 t = new Oxygen();
        t.grow();

        Oxygen oxygen = new Oxygen();
        oxygen.release();
        oxygen.purifyAir();
    }
}
