package com.encapsulation.internal;

public class Mutant {
    private String name = "Logan";
    private String power = "Regeneration";
    private int age = 150;
    private boolean isHero = true;
    private String team = "X-Men";

    void setName(String name) {
        this.name = name;
    }

    void setPower(String power) {
        this.power = power;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setIsHero(boolean isHero) {
        this.isHero = isHero;
    }

    void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return this.name;
    }

    public String getPower() {
        return this.power;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getIsHero() {
        return this.isHero;
    }

    public String getTeam() {
        return this.team;
    }
}