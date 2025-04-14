package com.samuel.work;

public class VRStation {
    public VRStation() {
        System.out.println("Running the VRStation constructor");
    }

    public void show(VirtualReality55 vr) {
        if (vr != null) {
            vr.explore();
            if (vr instanceof AdvancedVR55) {
                AdvancedVR55 ref = (AdvancedVR55) vr;
                ref.experienceHolo();
            } else {
                System.out.println("VirtualReality55 is not an instance of AdvancedVR55, cannot call cascaded method");
            }
        } else {
            System.out.println("VirtualReality55 is null");
        }
    }
}
