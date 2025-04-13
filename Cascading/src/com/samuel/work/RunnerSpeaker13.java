package com.samuel.work;

public class RunnerSpeaker13 {
    public static void main(String[] args) {
        Speaker13 speaker = new Speaker13();
        speaker.playSound(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Speaker13 bluetoothSpeaker = new BluetoothSpeaker13();
        bluetoothSpeaker.playSound(); // RUNTIME POLYMORPHISM

        BluetoothSpeaker13 bs13 = new BluetoothSpeaker13();
        bs13.playSound(); // NORMALLY ACCESSING CHILD CLASS METHOD
        bs13.connectBluetooth();

        ElectronicsStore store = new ElectronicsStore();
        store.show(speaker);
        store.show(bs13);
    }
}
