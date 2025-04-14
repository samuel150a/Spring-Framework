package com.samuel.work;

public class RunnerChip23 {
    public static void main(String[] args) {
        Chip23 chip = new Chip23();
        chip.process(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Chip23 smartChip = new SmartChip23();
        smartChip.process(); // RUNTIME POLYMORPHISM

        SmartChip23 sc23 = new SmartChip23();
        sc23.process(); // NORMALLY ACCESSING CHILD CLASS METHOD
        sc23.encryptData();

        ChipLab lab = new ChipLab();
        lab.show(chip);
        lab.show(sc23);
    }
}
