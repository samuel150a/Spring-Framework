package com.equals.task;

import java.util.Objects;

public class Monitor25 {
    private String Brand;
    private String Size;
    private String Resolution;
    private String Owner;

    public Monitor25(String Brand, String Size, String Resolution, String Owner) {
        this.Brand = Brand;
        this.Size = Size;
        this.Resolution = Resolution;
        this.Owner = Owner;

        System.out.println("Running in the Monitor25 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Monitor25) {
            Monitor25 monitor = (Monitor25) every;
            if (Objects.equals(this.Brand, monitor.Brand) &&
                    Objects.equals(this.Size, monitor.Size) &&
                    Objects.equals(this.Resolution, monitor.Resolution) &&
                    Objects.equals(this.Owner, monitor.Owner)) {
                System.out.println("Monitor25 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Size: " + this.Size +
                " Resolution: " + this.Resolution + " Owner: " + this.Owner;
    }
}
