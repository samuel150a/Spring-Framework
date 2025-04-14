package com.samuel.work;

public class RunnerComb99 {
    public static void main(String[] args) {
        Comb99 comb = new Comb99();
        comb.use(); // PARENT CLASS METHOD

        Comb99 hairComb = new HairComb99();
        hairComb.use(); // RUNTIME POLYMORPHISM

        HairComb99 hc = new HairComb99();
        hc.use(); // CHILD CLASS METHOD
        hc.styleHair();

        CombStore store = new CombStore();
        store.show(comb);
        store.show(hc);
    }
}
