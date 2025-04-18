package com.equals.task;

import java.util.Objects;

public class Sea19 {
    private String Type;
    private String Location;
    private int Depth;
    private String Researcher;

    public Sea19(String Type, String Location, int Depth, String Researcher) {
        this.Type = Type;
        this.Location = Location;
        this.Depth = Depth;
        this.Researcher = Researcher;

        System.out.println("Running in the Sea19 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Sea19) {
            Sea19 sea = (Sea19) every;
            if (Objects.equals(this.Type, sea.Type) &&
                    Objects.equals(this.Location, sea.Location) &&
                    Objects.equals(this.Depth, sea.Depth) &&
                    Objects.equals(this.Researcher, sea.Researcher)) {
                System.out.println("Sea19 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Type: " + this.Type + " Location: " + this.Location + " Depth: " + this.Depth + " meters Researcher: " + this.Researcher;
    }
}
