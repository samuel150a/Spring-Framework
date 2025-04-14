package com.samuel.work;

public class RunnerTablet61 {
    public static void main(String[] args) {
        Tablet61 tablet = new Tablet61();
        tablet.consume(); // PARENT CLASS METHOD

        Tablet61 medTablet = new MedicineTablet61();
        medTablet.consume(); // RUNTIME POLYMORPHISM

        MedicineTablet61 mt = new MedicineTablet61();
        mt.consume(); // CHILD CLASS METHOD
        mt.cureIllness();

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.show(tablet);
        pharmacy.show(mt);
    }
}
