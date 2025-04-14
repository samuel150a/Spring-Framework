package com.samuel.work;

public class RunnerGuitar83 {
    public static void main(String[] args) {
        Guitar83 guitar = new Guitar83();
        guitar.play(); // PARENT CLASS METHOD

        Guitar83 electricGuitar = new ElectricGuitar83();
        electricGuitar.play(); // RUNTIME POLYMORPHISM

        ElectricGuitar83 eg = new ElectricGuitar83();
        eg.play(); // CHILD CLASS METHOD
        eg.amplify();

        GuitarStore store = new GuitarStore();
        store.show(guitar);
        store.show(eg);
    }
}
