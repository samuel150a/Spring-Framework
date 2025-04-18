package com.equals.task;

import java.util.Objects;

public class LED10 {
    private String Brand;
    private String Size;
    private String Resolution;
    private String Owner;

    public LED10(String Brand, String Size, String Resolution, String Owner) {
        this.Brand = Brand;
        this.Size = Size;
        this.Resolution = Resolution;
        this.Owner = Owner;

        System.out.println("Running in the LED10 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof LED10) {
            LED10 led = (LED10) every;
            if (Objects.equals(this.Brand, led.Brand) &&
                    Objects.equals(this.Size, led.Size) &&
                    Objects.equals(this.Resolution, led.Resolution) &&
                    Objects.equals(this.Owner, led.Owner)) {
                System.out.println("LED10 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Size: " + this.Size + " Resolution: " + this.Resolution + " Owner: " + this.Owner;
    }
}
