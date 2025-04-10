package com.sam.task;

public class RunnerArmy18 {
    public static void main(String[] args) {
        Army18 army = new Army18();
        army.protectNation();

        Army18 a = new Gun();
        a.protectNation();

        Gun gun = new Gun();
        gun.shoot();
        gun.reload();
    }
}
