package com.samuel.work;

public class CameraShop {
    public CameraShop() {
        System.out.println("Running the CameraShop constructor");
    }

    public void show(Camera64 camera) {
        if (camera != null) {
            camera.click();
            if (camera instanceof DslrCamera64) {
                DslrCamera64 ref = (DslrCamera64) camera;
                ref.zoomLens();
            } else {
                System.out.println("Camera64 is not an instance of DslrCamera64, cannot call cascaded method");
            }
        } else {
            System.out.println("Camera64 is null");
        }
    }
}
