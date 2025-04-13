package com.samuel.work;

public class AI_Robot14 extends Robot14 {
    public AI_Robot14() {
        System.out.println("Running in the AI_Robot14 constructor");
    }

    @Override
    public void work() {
        System.out.println("Running public method work by child class");
    }

    public void analyzeData() {
        System.out.println("Running in public method analyzeData");
    }
}
