package com.samuel.work;

public class TowelShop {
    public TowelShop() {
        System.out.println("Running the TowelShop constructor");
    }

    public void show(Towel76 towel) {
        if (towel != null) {
            towel.use();
            if (towel instanceof CottonTowel76) {
                CottonTowel76 ref = (CottonTowel76) towel;
                ref.absorb();
            } else {
                System.out.println("Towel76 is not an instance of CottonTowel76, cannot call cascaded method");
            }
        } else {
            System.out.println("Towel76 is null");
        }
    }
}
