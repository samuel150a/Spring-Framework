package com.samuel.work;

public class DrumStore {
    public DrumStore() {
        System.out.println("Running the DrumStore constructor");
    }

    public void show(Drum84 drum) {
        if (drum != null) {
            drum.play();
            if (drum instanceof ElectricDrum84) {
                ElectricDrum84 ref = (ElectricDrum84) drum;
                ref.amplify();
            } else {
                System.out.println("Drum84 is not an instance of ElectricDrum84, cannot call cascaded method");
            }
        } else {
            System.out.println("Drum84 is null");
        }
    }
}
