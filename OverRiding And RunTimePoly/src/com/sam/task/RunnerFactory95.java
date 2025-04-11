package com.sam.task;

public class RunnerFactory95 {
    public static void main(String[] args) {
        Factory95 factory = new Factory95();
        factory.produce();

        Factory95 f = new Machine();
        f.produce();

        Machine machine = new Machine();
        machine.startMachine();
        machine.stopMachine();
    }
}
