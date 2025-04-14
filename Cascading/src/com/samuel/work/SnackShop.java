package com.samuel.work;

public class SnackShop {
    public SnackShop() {
        System.out.println("Running the SnackShop constructor");
    }

    public void show(Chips70 chips) {
        if (chips != null) {
            chips.eat();
            if (chips instanceof SpicyChips70) {
                SpicyChips70 ref = (SpicyChips70) chips;
                ref.addMasala();
            } else {
                System.out.println("Chips70 is not an instance of SpicyChips70, cannot call cascaded method");
            }
        } else {
            System.out.println("Chips70 is null");
        }
    }
}
