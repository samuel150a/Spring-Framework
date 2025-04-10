package com.sam.task;

public class RunnerJungle {
    public static void main(String[] args) {
        Jungle11 jungle = new Jungle11();
        jungle.grow();

        Jungle11 ref = new Trees();
        ref.grow();

        Trees trees = new Trees();
        trees.giveOxygen();
        trees.provideShade();
    }
}
