package com.samuel.work;

public class ChipLab {
    public ChipLab() {
        System.out.println("Running the ChipLab constructor");
    }

    public void show(Chip23 chip) {
        if (chip != null) {
            chip.process();
            if (chip instanceof SmartChip23) {
                SmartChip23 ref = (SmartChip23) chip;
                ref.encryptData();
            } else {
                System.out.println("Chip23 is not an instance of SmartChip23, cannot call cascaded method");
            }
        } else {
            System.out.println("Chip23 is null");
        }
    }
}
