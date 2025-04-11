package com.sam.task;

public class RunnerFarm97 {
    public static void main(String[] args) {
        Farm97 farm = new Farm97();
        farm.cultivate();

        Farm97 f = new Crop();
        f.cultivate();

        Crop crop = new Crop();
        crop.water();
        crop.harvest();
    }
}
