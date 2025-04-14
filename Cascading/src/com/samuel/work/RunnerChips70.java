package com.samuel.work;

public class RunnerChips70 {
    public static void main(String[] args) {
        Chips70 chips = new Chips70();
        chips.eat(); // PARENT CLASS METHOD

        Chips70 spicy = new SpicyChips70();
        spicy.eat(); // RUNTIME POLYMORPHISM

        SpicyChips70 sc = new SpicyChips70();
        sc.eat(); // CHILD CLASS METHOD
        sc.addMasala();

        SnackShop shop = new SnackShop();
        shop.show(chips);
        shop.show(sc);
    }
}
