package com.samuel.work;

public class RunnerMarker35 {
    public static void main(String[] args) {
        Marker35 marker = new Marker35();
        marker.write(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Marker35 permanentMarker = new PermanentMarker35();
        permanentMarker.write(); // RUNTIME POLYMORPHISM

        PermanentMarker35 pm35 = new PermanentMarker35();
        pm35.write(); // NORMALLY ACCESSING CHILD CLASS METHOD
        pm35.mark();

        MarkerCase case1 = new MarkerCase();
        case1.show(marker);
        case1.show(pm35);
    }
}
