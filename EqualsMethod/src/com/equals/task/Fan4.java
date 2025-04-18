package com.equals.task;

import java.util.Objects;

public class Fan4 {
    private String Brand;
    private String Color;
    private int Speed;
    private String Owner;

    public Fan4(String Brand, String Color, int Speed, String Owner) {
        this.Brand = Brand;
        this.Color = Color;
        this.Speed = Speed;
        this.Owner = Owner;

        System.out.println("Running in the Fan4 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Fan4) {
            Fan4 fan = (Fan4) every;
            if (Objects.equals(this.Brand, fan.Brand) &&
                    Objects.equals(this.Color, fan.Color) &&
                    Objects.equals(this.Speed, fan.Speed) &&
                    Objects.equals(this.Owner, fan.Owner)) {
                System.out.println("Fan4 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Color: " + this.Color + " Speed: " + this.Speed + "RPM Owner: " + this.Owner;
    }
}
