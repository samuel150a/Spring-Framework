package com.equals.task;

import java.util.Objects;

public class Resistor8 {
    private String material;
    private String colorCode;
    private int resistance;
    private String type;

    void setMaterial(String material) {
        this.material = material;
    }

    void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    void setResistance(int resistance) {
        this.resistance = resistance;
    }

    void setType(String type) {
        this.type = type;
    }

    String getMaterial() {
        return material;
    }

    String getColorCode() {
        return colorCode;
    }

    int getResistance() {
        return resistance;
    }

    String getType() {
        return type;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Resistor8) {
            Resistor8 resistor = (Resistor8) any;
            if (Objects.equals(this.material, resistor.material) &&
                    Objects.equals(this.colorCode, resistor.colorCode) &&
                    Objects.equals(this.resistance, resistor.resistance) &&
                    Objects.equals(this.type, resistor.type)) {
                System.out.println("resistor is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", ColorCode: " + this.colorCode + ", Resistance: " + this.resistance + ", Type: " + this.type;
    }
}
