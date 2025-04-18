package com.equals.task;

import java.util.Objects;

public class River20 {
    private String Name;
    private String Length;
    private String Origin;
    private String Region;

    public River20(String Name, String Length, String Origin, String Region) {
        this.Name = Name;
        this.Length = Length;
        this.Origin = Origin;
        this.Region = Region;

        System.out.println("Running in the River20 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof River20) {
            River20 river = (River20) every;
            if (Objects.equals(this.Name, river.Name) &&
                    Objects.equals(this.Length, river.Length) &&
                    Objects.equals(this.Origin, river.Origin) &&
                    Objects.equals(this.Region, river.Region)) {
                System.out.println("River20 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + this.Name + " Length: " + this.Length + " Origin: " + this.Origin + " Region: " + this.Region;
    }
}
