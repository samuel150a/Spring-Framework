package com.samuel.work;

public class ElectronicsStore1 {
    public ElectronicsStore1() {
        System.out.println("Running the ElectronicsStore constructor");
    }

    public void show(Speaker65 speaker) {
        if (speaker != null) {
            speaker.playSound();
            if (speaker instanceof BluetoothSpeaker65) {
                BluetoothSpeaker65 ref = (BluetoothSpeaker65) speaker;
                ref.connectBluetooth();
            } else {
                System.out.println("Speaker65 is not an instance of BluetoothSpeaker65, cannot call cascaded method");
            }
        } else {
            System.out.println("Speaker65 is null");
        }
    }
}
