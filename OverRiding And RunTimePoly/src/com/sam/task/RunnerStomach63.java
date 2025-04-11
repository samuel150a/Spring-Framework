package com.sam.task;

public class RunnerStomach63 {
    public static void main(String[] args) {
        Stomach63 stomach = new Stomach63();
        stomach.breakDownFood();

        Stomach63 s = new Digest();
        s.breakDownFood();

        Digest digest = new Digest();
        digest.absorbNutrients();
        digest.produceAcid();
    }
}
