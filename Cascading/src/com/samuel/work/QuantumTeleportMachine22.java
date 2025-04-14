package com.samuel.work;

public class QuantumTeleportMachine22 extends TeleportMachine22 {
    public QuantumTeleportMachine22() {
        System.out.println("Running in the QuantumTeleportMachine22 constructor");
    }

    @Override
    public void teleport() {
        System.out.println("Running public method teleport by child class");
    }

    public void setCoordinates() {
        System.out.println("Running in public method setCoordinates");
    }
}
