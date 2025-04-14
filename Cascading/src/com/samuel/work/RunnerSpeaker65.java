package com.samuel.work;

public class RunnerSpeaker65 {
    public static void main(String[] args) {
        Speaker65 speaker = new Speaker65();
        speaker.playSound(); // PARENT CLASS METHOD

        Speaker65 btSpeaker = new BluetoothSpeaker65();
        btSpeaker.playSound(); // RUNTIME POLYMORPHISM

        BluetoothSpeaker65 bts = new BluetoothSpeaker65();
        bts.playSound(); // CHILD CLASS METHOD
        bts.connectBluetooth();

        ElectronicsStore1 store = new ElectronicsStore1();
        store.show(speaker);
        store.show(bts);
    }
}
