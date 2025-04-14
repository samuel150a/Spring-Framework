package com.samuel.work;

public class SmartCircuit25 extends Circuit25 {
    public SmartCircuit25() {
        System.out.println("Running in the SmartCircuit25 constructor");
    }

    @Override
    public void connect() {
        System.out.println("Running public method connect by child class");
    }

    public void runDiagnostics() {
        System.out.println("Running in public method runDiagnostics");
    }
}
