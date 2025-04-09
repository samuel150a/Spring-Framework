package com.encapsulation.internal;

public class KeyChain {
    private String material = "Metal";
    private String color = "Silver";
    private int numberOfKeys = 3;
    private boolean hasNameTag = true;
    private String ownerName = "Rahul";

    void setMaterial(String material) {
        this.material = material;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    void setHasNameTag(boolean hasNameTag) {
        this.hasNameTag = hasNameTag;
    }

    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public boolean getHasNameTag() {
        return this.hasNameTag;
    }

    public String getOwnerName() {
        return this.ownerName;
    }
}

