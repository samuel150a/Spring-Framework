package com.samuel.work;

public class CombStore {
    public CombStore() {
        System.out.println("Running the CombStore constructor");
    }

    public void show(Comb99 comb) {
        if (comb != null) {
            comb.use();
            if (comb instanceof HairComb99) {
                HairComb99 ref = (HairComb99) comb;
                ref.styleHair();
            } else {
                System.out.println("Comb99 is not an instance of HairComb99, cannot call cascaded method");
            }
        } else {
            System.out.println("Comb99 is null");
        }
    }
}
