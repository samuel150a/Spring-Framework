package com.samuel.work;

public class Pharmacy {
    public Pharmacy() {
        System.out.println("Running the Pharmacy constructor");
    }

    public void show(Tablet61 tablet) {
        if (tablet != null) {
            tablet.consume();
            if (tablet instanceof MedicineTablet61) {
                MedicineTablet61 ref = (MedicineTablet61) tablet;
                ref.cureIllness();
            } else {
                System.out.println("Tablet61 is not an instance of MedicineTablet61, cannot call cascaded method");
            }
        } else {
            System.out.println("Tablet61 is null");
        }
    }
}
