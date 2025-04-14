package com.samuel.work;

public class FragranceStore {
    public FragranceStore() {
        System.out.println("Running the FragranceStore constructor");
    }

    public void show(Perfume60 perfume) {
        if (perfume != null) {
            perfume.spray();
            if (perfume instanceof LuxuryPerfume60) {
                LuxuryPerfume60 ref = (LuxuryPerfume60) perfume;
                ref.longLasting();
            } else {
                System.out.println("Perfume60 is not an instance of LuxuryPerfume60, cannot call cascaded method");
            }
        } else {
            System.out.println("Perfume60 is null");
        }
    }
}
