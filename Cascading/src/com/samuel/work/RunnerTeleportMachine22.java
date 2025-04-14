package com.samuel.work;

public class RunnerTeleportMachine22 {
    public static void main(String[] args) {
        TeleportMachine22 machine = new TeleportMachine22();
        machine.teleport(); // NORMALLY ACCESSING PARENT CLASS METHOD

        TeleportMachine22 quantumMachine = new QuantumTeleportMachine22();
        quantumMachine.teleport(); // RUNTIME POLYMORPHISM

        QuantumTeleportMachine22 qtm22 = new QuantumTeleportMachine22();
        qtm22.teleport(); // NORMALLY ACCESSING CHILD CLASS METHOD
        qtm22.setCoordinates();

        TeleportStation station = new TeleportStation();
        station.show(machine);
        station.show(qtm22);
    }
}
