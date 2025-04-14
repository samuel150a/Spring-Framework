package com.samuel.work;

public class CosmeticStore {
    public CosmeticStore() {
        System.out.println("Running the CosmeticStore constructor");
    }

    public void show(Cream58 cream) {
        if (cream != null) {
            cream.apply();
            if (cream instanceof Sunscreen58) {
                Sunscreen58 ref = (Sunscreen58) cream;
                ref.protectFromSun();
            } else {
                System.out.println("Cream58 is not an instance of Sunscreen58, cannot call cascaded method");
            }
        } else {
            System.out.println("Cream58 is null");
        }
    }
}
