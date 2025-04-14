package com.samuel.work;

public class RunnerRoff95 {
    public static void main(String[] args) {
        Roff95 roff = new Roff95();
        roff.use(); // PARENT CLASS METHOD

        Roff95 electricRoff = new ElectricRoff95();
        electricRoff.use(); // RUNTIME POLYMORPHISM

        ElectricRoff95 er = new ElectricRoff95();
        er.use(); // CHILD CLASS METHOD
        er.charge();

        RoffStore store = new RoffStore();
        store.show(roff);
        store.show(er);
    }
}
