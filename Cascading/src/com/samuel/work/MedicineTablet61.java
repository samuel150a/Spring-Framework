package com.samuel.work;

public class MedicineTablet61 extends Tablet61 {
    public MedicineTablet61() {
        System.out.println("Running in the MedicineTablet61 constructor");
    }

    @Override
    public void consume() {
        System.out.println("Running public method consume by child class");
    }

    public void cureIllness() {
        System.out.println("Running in public method cureIllness");
    }
}
