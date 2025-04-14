package com.samuel.work;

public class QuantumTimeMachine54 extends TimeMachine54 {
    public QuantumTimeMachine54() {
        System.out.println("Running in the QuantumTimeMachine54 constructor");
    }

    @Override
    public void travel() {
        System.out.println("Running public method travel by child class");
    }

    public void setTimeCoordinates() {
        System.out.println("Running in public method setTimeCoordinates");
    }
}
