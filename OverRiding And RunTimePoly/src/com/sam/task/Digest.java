package com.sam.task;

public class Digest extends Stomach63 {
    public Digest() {
        System.out.println("Running in the Digest constructor");
    }

    @Override
    public void breakDownFood() {
        System.out.println("Running in the overridden method breakDownFood from Digest");
    }

    public void absorbNutrients() {
        System.out.println("Running in the public method absorbNutrients");
    }

    public void produceAcid() {
        System.out.println("Running in the public method produceAcid");
    }
}
