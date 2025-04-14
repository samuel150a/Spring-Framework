package com.samuel.work;

public class RunnerPerfume60 {
    public static void main(String[] args) {
        Perfume60 perfume = new Perfume60();
        perfume.spray(); // PARENT CLASS METHOD

        Perfume60 luxury = new LuxuryPerfume60();
        luxury.spray(); // RUNTIME POLYMORPHISM

        LuxuryPerfume60 lPerfume = new LuxuryPerfume60();
        lPerfume.spray(); // CHILD CLASS METHOD
        lPerfume.longLasting();

        FragranceStore store = new FragranceStore();
        store.show(perfume);
        store.show(lPerfume);
    }
}
