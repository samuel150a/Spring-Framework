package com.equals.task;

import java.util.Objects;

public class Nodemcu27 {
    private String model;
    private String chip;
    private int gpioPins;
    private boolean wifiSupport;

    void setModel(String model) {
        this.model = model;
    }

    void setChip(String chip) {
        this.chip = chip;
    }

    void setGpioPins(int gpioPins) {
        this.gpioPins = gpioPins;
    }

    void setWifiSupport(boolean wifiSupport) {
        this.wifiSupport = wifiSupport;
    }

    String getModel() {
        return model;
    }

    String getChip() {
        return chip;
    }

    int getGpioPins() {
        return gpioPins;
    }

    boolean getWifiSupport() {
        return wifiSupport;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Nodemcu27) {
            Nodemcu27 node = (Nodemcu27) any;
            if (Objects.equals(this.model, node.model) &&
                    Objects.equals(this.chip, node.chip) &&
                    Objects.equals(this.gpioPins, node.gpioPins) &&
                    Objects.equals(this.wifiSupport, node.wifiSupport)) {
                System.out.println("nodemcu is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Model: " + this.model +
                ", Chip: " + this.chip +
                ", GPIO Pins: " + this.gpioPins +
                ", WiFi Support: " + this.wifiSupport;
    }
}
