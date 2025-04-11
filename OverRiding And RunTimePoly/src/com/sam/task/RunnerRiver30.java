package com.sam.task;

public class RunnerRiver30 {
    public static void main(String[] args) {
        River30 river = new River30();
        river.flow();

        River30 r = new ClothWash();
        r.flow();

        ClothWash cloth = new ClothWash();
        cloth.rinse();
        cloth.dry();
    }
}
