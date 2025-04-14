package com.samuel.work;

public class CircuitBoard {
    public CircuitBoard() {
        System.out.println("Running the CircuitBoard constructor");
    }

    public void show(Circuit25 circuit) {
        if (circuit != null) {
            circuit.connect();
            if (circuit instanceof SmartCircuit25) {
                SmartCircuit25 ref = (SmartCircuit25) circuit;
                ref.runDiagnostics();
            } else {
                System.out.println("Circuit25 is not an instance of SmartCircuit25, cannot call cascaded method");
            }
        } else {
            System.out.println("Circuit25 is null");
        }
    }
}
