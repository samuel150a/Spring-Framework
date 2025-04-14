package com.samuel.work;

public class RunnerSlipper44 {
    public static void main(String[] args) {
        Slipper44 slipper = new Slipper44();
        slipper.wear(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Slipper44 rubber = new RubberSlipper44();
        rubber.wear(); // RUNTIME POLYMORPHISM

        RubberSlipper44 rs44 = new RubberSlipper44();
        rs44.wear(); // NORMALLY ACCESSING CHILD CLASS METHOD
        rs44.wash();

        ShoeRack rack = new ShoeRack();
        rack.show(slipper);
        rack.show(rs44);
    }
}
