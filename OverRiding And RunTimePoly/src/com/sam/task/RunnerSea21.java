package com.sam.task;

public class RunnerSea21 {
    public static void main(String[] args) {
        Sea21 sea = new Sea21();
        sea.flow();

        Sea21 s = new Fish();
        s.flow();

        Fish fish = new Fish();
        fish.swim();
        fish.breathe();
    }
}
