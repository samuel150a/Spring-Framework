package com.samuel.work;

public class RunnerTowel76 {
    public static void main(String[] args) {
        Towel76 towel = new Towel76();
        towel.use(); // PARENT CLASS METHOD

        Towel76 cottonTowel = new CottonTowel76();
        cottonTowel.use(); // RUNTIME POLYMORPHISM

        CottonTowel76 ct = new CottonTowel76();
        ct.use(); // CHILD CLASS METHOD
        ct.absorb();

        TowelShop shop = new TowelShop();
        shop.show(towel);
        shop.show(ct);
    }
}
