package com.samuel.work;

public class RunnerVR55 {
    public static void main(String[] args) {
        VirtualReality55 vr = new VirtualReality55();
        vr.explore(); // PARENT CLASS METHOD

        VirtualReality55 advanced = new AdvancedVR55();
        advanced.explore(); // RUNTIME POLYMORPHISM

        AdvancedVR55 advancedVR = new AdvancedVR55();
        advancedVR.explore(); // CHILD CLASS METHOD
        advancedVR.experienceHolo();

        VRStation station = new VRStation();
        station.show(vr);
        station.show(advancedVR);
    }
}
