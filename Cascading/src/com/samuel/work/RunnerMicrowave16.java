package com.samuel.work;

public class RunnerMicrowave16 {
    public static void main(String[] args) {
        Microwave16 microwave = new Microwave16();
        microwave.cook(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Microwave16 smartMicrowave = new SmartMicrowave16();
        smartMicrowave.cook(); // RUNTIME POLYMORPHISM

        SmartMicrowave16 sm16 = new SmartMicrowave16();
        sm16.cook(); // NORMALLY ACCESSING CHILD CLASS METHOD
        sm16.defrost();

        KitchenStore store = new KitchenStore();
        store.show(microwave);
        store.show(sm16);
    }
}
