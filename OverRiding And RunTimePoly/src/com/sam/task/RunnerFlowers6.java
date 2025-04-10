package com.sam.task;

public class RunnerFlowers6 {
    public static void main(String[] args)
    {
        Flowers6 flowers6=new Flowers6();
        flowers6.Smell();

        Flowers6 flowers=new Lotus6();
        flowers.Smell(); // run time poly

        Lotus6 lotus6 =new Lotus6();
        lotus6.Petals();
        lotus6.Root();

    }
}
