package com.equals.task;

import java.util.Objects;

public class Screen5 {
    private String Brand;
    private String Size;
    private String Resolution;
    private String Owner;

    public Screen5(String Brand, String Size, String Resolution, String Owner) {
        this.Brand = Brand;
        this.Size = Size;
        this.Resolution = Resolution;
        this.Owner = Owner;

        System.out.println("Running in the Screen5 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Screen5) {
            Screen5 screen = (Screen5) every;
            if (Objects.equals(this.Brand, screen.Brand) &&
                    Objects.equals(this.Size, screen.Size) &&
                    Objects.equals(this.Resolution, screen.Resolution) &&
                    Objects.equals(this.Owner, screen.Owner)) {
                System.out.println("Screen5 is matching");
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
