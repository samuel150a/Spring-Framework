package com.samuel.work;

public class BluetoothSpeaker13 extends Speaker13 {
    public BluetoothSpeaker13() {
        System.out.println("Running in the BluetoothSpeaker13 constructor");
    }

    @Override
    public void playSound() {
        System.out.println("Running public method playSound by child class");
    }

    public void connectBluetooth() {
        System.out.println("Running in public method connectBluetooth");
    }
}
