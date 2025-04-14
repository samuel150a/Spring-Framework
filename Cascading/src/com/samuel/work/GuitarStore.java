package com.samuel.work;

public class GuitarStore {
    public GuitarStore() {
        System.out.println("Running the GuitarStore constructor");
    }

    public void show(Guitar83 guitar) {
        if (guitar != null) {
            guitar.play();
            if (guitar instanceof ElectricGuitar83) {
                ElectricGuitar83 ref = (ElectricGuitar83) guitar;
                ref.amplify();
            } else {
                System.out.println("Guitar83 is not an instance of ElectricGuitar83, cannot call cascaded method");
            }
        } else {
            System.out.println("Guitar83 is null");
        }
    }
}
