package com.samuel.work;

public class ElectronicsStore {
    public ElectronicsStore() {
        System.out.println("Running the ElectronicsStore constructor");
    }

    public void show(Speaker13 speaker) {
        if (speaker != null) {
            speaker.playSound();
            if (speaker instanceof BluetoothSpeaker13) {
                BluetoothSpeaker13 ref = (BluetoothSpeaker13) speaker;
                ref.connectBluetooth();
            } else {
                System.out.println("Speaker13 is not an instance of BluetoothSpeaker13, cannot call cascaded method");
            }
        } else {
            System.out.println("Speaker13 is null");
        }
    }
}
