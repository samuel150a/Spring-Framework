package com.samuel.work;

public class LaptopStore {
    public LaptopStore() {
        System.out.println("Running the LaptopStore constructor");
    }

    public void show(Laptop11 laptop) {
        if (laptop != null) {
            laptop.open();
            if (laptop instanceof GamingLaptop11) {
                GamingLaptop11 ref = (GamingLaptop11) laptop;
                ref.playGame();
            } else {
                System.out.println("Laptop11 is not an instance of GamingLaptop11, cannot call cascaded method");
            }
        } else {
            System.out.println("Laptop11 is null");
        }
    }
}
