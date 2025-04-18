package com.equals.task;

import java.util.Objects;

public class Map15 {
    private String name;
    private String region;
    private int scale;
    private String type;

    void setName(String name) {
        this.name = name;
    }

    void setRegion(String region) {
        this.region = region;
    }

    void setScale(int scale) {
        this.scale = scale;
    }

    void setType(String type) {
        this.type = type;
    }

    String getName() {
        return name;
    }

    String getRegion() {
        return region;
    }

    int getScale() {
        return scale;
    }

    String getType() {
        return type;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Map15) {
            Map15 map = (Map15) any;
            if (Objects.equals(this.name, map.name) &&
                    Objects.equals(this.region, map.region) &&
                    Objects.equals(this.scale, map.scale) &&
                    Objects.equals(this.type, map.type)) {
                System.out.println("map is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Region: " + this.region + ", Scale: " + this.scale + ", Type: " + this.type;
    }
}
