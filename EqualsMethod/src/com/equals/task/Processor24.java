package com.equals.task;

import java.util.Objects;

public class Processor24 {
    private String Brand;
    private String Series;
    private int Cores;
    private String Owner;

    public Processor24(String Brand, String Series, int Cores, String Owner) {
        this.Brand = Brand;
        this.Series = Series;
        this.Cores = Cores;
        this.Owner = Owner;

        System.out.println("Running in the Processor24 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Processor24) {
            Processor24 processor = (Processor24) every;
            if (Objects.equals(this.Brand, processor.Brand) &&
                    Objects.equals(this.Series, processor.Series) &&
                    Objects.equals(this.Cores, processor.Cores) &&
                    Objects.equals(this.Owner, processor.Owner)) {
                System.out.println("Processor24 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Series: " + this.Series +
                " Cores: " + this.Cores + " Owner: " + this.Owner;
    }
}
