package com.samuel.work;

public class SkinCareCenter {
    public SkinCareCenter() {
        System.out.println("Running the SkinCareCenter constructor");
    }

    public void show(Lotion59 lotion) {
        if (lotion != null) {
            lotion.apply();
            if (lotion instanceof BodyLotion59) {
                BodyLotion59 ref = (BodyLotion59) lotion;
                ref.moisturizeSkin();
            } else {
                System.out.println("Lotion59 is not an instance of BodyLotion59, cannot call cascaded method");
            }
        } else {
            System.out.println("Lotion59 is null");
        }
    }
}
