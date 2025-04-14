package com.samuel.work;

public class RunnerCircuit25 {
    public static void main(String[] args) {
        Circuit25 circuit = new Circuit25();
        circuit.connect(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Circuit25 smartCircuit = new SmartCircuit25();
        smartCircuit.connect(); // RUNTIME POLYMORPHISM

        SmartCircuit25 sc25 = new SmartCircuit25();
        sc25.connect(); // NORMALLY ACCESSING CHILD CLASS METHOD
        sc25.runDiagnostics();

        CircuitBoard board = new CircuitBoard();
        board.show(circuit);
        board.show(sc25);
    }
}
