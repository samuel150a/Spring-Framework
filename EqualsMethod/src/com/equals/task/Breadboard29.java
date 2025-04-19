package com.equals.task;

import java.util.Objects;

public class Breadboard29 {
    private String size;
    private int holes;
    private boolean powerRails;
    private String color;

    void setSize(String size) {
        this.size = size;
    }

    void setHoles(int holes) {
        this.holes = holes;
    }

    void setPowerRails(boolean powerRails) {
        this.powerRails = powerRails;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getSize() {
        return size;
    }

    int getHoles() {
        return holes;
    }

    boolean getPowerRails() {
        return powerRails;
    }

    String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Breadboard29) {
            Breadboard29 board = (Breadboard29) any;
            if (Objects.equals(this.size, board.size) &&
                    Objects.equals(this.holes, board.holes) &&
                    Objects.equals(this.powerRails, board.powerRails) &&
                    Objects.equals(this.color, board.color)) {
                System.out.println("breadboard is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Size: " + this.size +
                ", Holes: " + this.holes +
                ", Power Rails: " + this.powerRails +
                ", Color: " + this.color;
    }
}
