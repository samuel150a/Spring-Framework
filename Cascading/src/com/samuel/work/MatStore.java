package com.samuel.work;

public class MatStore {
    public MatStore() {
        System.out.println("Running the MatStore constructor");
    }

    public void show(Mat67 mat) {
        if (mat != null) {
            mat.rollOut();
            if (mat instanceof YogaMat67) {
                YogaMat67 ref = (YogaMat67) mat;
                ref.stretchOnIt();
            } else {
                System.out.println("Mat67 is not an instance of YogaMat67, cannot call cascaded method");
            }
        } else {
            System.out.println("Mat67 is null");
        }
    }
}
