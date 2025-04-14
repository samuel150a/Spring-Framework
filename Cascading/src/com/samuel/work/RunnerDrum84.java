package com.samuel.work;

public class RunnerDrum84 {
    public static void main(String[] args) {
        Drum84 drum = new Drum84();
        drum.play(); // PARENT CLASS METHOD

        Drum84 electricDrum = new ElectricDrum84();
        electricDrum.play(); // RUNTIME POLYMORPHISM

        ElectricDrum84 ed = new ElectricDrum84();
        ed.play(); // CHILD CLASS METHOD
        ed.amplify();

        DrumStore store = new DrumStore();
        store.show(drum);
        store.show(ed);
    }
}
