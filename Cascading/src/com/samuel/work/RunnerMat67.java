package com.samuel.work;

public class RunnerMat67 {
    public static void main(String[] args) {
        Mat67 mat = new Mat67();
        mat.rollOut(); // PARENT CLASS METHOD

        Mat67 yogaMat = new YogaMat67();
        yogaMat.rollOut(); // RUNTIME POLYMORPHISM

        YogaMat67 ym = new YogaMat67();
        ym.rollOut(); // CHILD CLASS METHOD
        ym.stretchOnIt();

        MatStore store = new MatStore();
        store.show(mat);
        store.show(ym);
    }
}
