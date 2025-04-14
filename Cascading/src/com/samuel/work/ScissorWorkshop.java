package com.samuel.work;

public class ScissorWorkshop {
    public ScissorWorkshop() {
        System.out.println("Running the ScissorWorkshop constructor");
    }

    public void show(Scissor29 scissor) {
        if (scissor != null) {
            scissor.cut();
            if (scissor instanceof ElectricScissor29) {
                ElectricScissor29 ref = (ElectricScissor29) scissor;
                ref.autoCut();
            } else {
                System.out.println("Scissor29 is not an instance of ElectricScissor29, cannot call cascaded method");
            }
        } else {
            System.out.println("Scissor29 is null");
        }
    }
}
