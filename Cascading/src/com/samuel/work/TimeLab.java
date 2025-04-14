package com.samuel.work;

public class TimeLab {
    public TimeLab() {
        System.out.println("Running the TimeLab constructor");
    }

    public void show(TimeMachine54 machine) {
        if (machine != null) {
            machine.travel();
            if (machine instanceof QuantumTimeMachine54) {
                QuantumTimeMachine54 ref = (QuantumTimeMachine54) machine;
                ref.setTimeCoordinates();
            } else {
                System.out.println("TimeMachine54 is not an instance of QuantumTimeMachine54, cannot call cascaded method");
            }
        } else {
            System.out.println("TimeMachine54 is null");
        }
    }
}
