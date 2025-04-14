package com.samuel.work;

public class RunnerScissor29 {
    public static void main(String[] args) {
        Scissor29 scissor = new Scissor29();
        scissor.cut(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Scissor29 electricScissor = new ElectricScissor29();
        electricScissor.cut(); // RUNTIME POLYMORPHISM

        ElectricScissor29 es29 = new ElectricScissor29();
        es29.cut(); // NORMALLY ACCESSING CHILD CLASS METHOD
        es29.autoCut();

        ScissorWorkshop workshop = new ScissorWorkshop();
        workshop.show(scissor);
        workshop.show(es29);
    }
}
