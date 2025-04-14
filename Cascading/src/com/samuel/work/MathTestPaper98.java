package com.samuel.work;

public class MathTestPaper98 extends TestPaper98 {
    public MathTestPaper98() {
        System.out.println("Running in the MathTestPaper98 constructor");
    }

    @Override
    public void examine() {
        System.out.println("Running public method examine by child class");
    }

    public void solveProblems() {
        System.out.println("Running in public method solveProblems");
    }
}
