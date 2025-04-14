package com.samuel.work;

public class TeleportStation {
    public TeleportStation() {
        System.out.println("Running the TeleportStation constructor");
    }

    public void show(TeleportMachine22 machine) {
        if (machine != null) {
            machine.teleport();
            if (machine instanceof QuantumTeleportMachine22) {
                QuantumTeleportMachine22 ref = (QuantumTeleportMachine22) machine;
                ref.setCoordinates();
            } else {
                System.out.println("TeleportMachine22 is not an instance of QuantumTeleportMachine22, cannot call cascaded method");
            }
        } else {
            System.out.println("TeleportMachine22 is null");
        }
    }
}
