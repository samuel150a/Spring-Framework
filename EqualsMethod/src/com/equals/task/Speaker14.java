package com.equals.task;

import java.util.Objects;

public class Speaker14 {
    private String brand;
    private int powerOutput;
    private String type;
    private boolean bluetoothSupport;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    void setType(String type) {
        this.type = type;
    }

    void setBluetoothSupport(boolean bluetoothSupport) {
        this.bluetoothSupport = bluetoothSupport;
    }

    String getBrand() {
        return brand;
    }

    int getPowerOutput() {
        return powerOutput;
    }

    String getType() {
        return type;
    }

    boolean getBluetoothSupport() {
        return bluetoothSupport;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Speaker14) {
            Speaker14 speaker = (Speaker14) any;
            if (Objects.equals(this.brand, speaker.brand) &&
                    Objects.equals(this.powerOutput, speaker.powerOutput) &&
                    Objects.equals(this.type, speaker.type) &&
                    Objects.equals(this.bluetoothSupport, speaker.bluetoothSupport)) {
                System.out.println("speaker is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Power Output: " + this.powerOutput + "W, Type: " + this.type + ", Bluetooth Support: " + this.bluetoothSupport;
    }
}
