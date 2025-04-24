package com.samworkz.external;

import com.samworkz.internal.Cable;

public class Tomoto {
    private Cable cable;

    public Tomoto(Cable cable) {
        this.cable = cable;
    }

    public void display() {
        if (cable != null) {
            this.cable.sound();
        } else {
            System.err.println("its null");
        }
    }
}

