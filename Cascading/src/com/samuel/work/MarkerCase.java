package com.samuel.work;

public class MarkerCase {
    public MarkerCase() {
        System.out.println("Running the MarkerCase constructor");
    }

    public void show(Marker35 marker) {
        if (marker != null) {
            marker.write();
            if (marker instanceof PermanentMarker35) {
                PermanentMarker35 ref = (PermanentMarker35) marker;
                ref.mark();
            } else {
                System.out.println("Marker35 is not an instance of PermanentMarker35, cannot call cascaded method");
            }
        } else {
            System.out.println("Marker35 is null");
        }
    }
}
