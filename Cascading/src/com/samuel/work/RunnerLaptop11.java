package com.samuel.work;

public class RunnerLaptop11 {
    public static void main(String[] args) {
        Laptop11 laptop = new Laptop11();
        laptop.open(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Laptop11 gamingLaptop = new GamingLaptop11();
        gamingLaptop.open(); // RUNTIME POLYMORPHISM

        GamingLaptop11 gl11 = new GamingLaptop11();
        gl11.open(); // NORMALLY ACCESSING CHILD CLASS METHOD
        gl11.playGame();

        LaptopStore store = new LaptopStore();
        store.show(laptop);
        store.show(gl11);
    }
}
