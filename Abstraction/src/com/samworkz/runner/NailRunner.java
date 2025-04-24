package com.samworkz.runner;

import com.samworkz.external.Clock;
import com.samworkz.external.Samosa;
import com.samworkz.external.Wall;
import com.samworkz.internal.Nail;

public class NailRunner {
    public static void main(String[] args) {
        Nail nail=new Wall();
        nail.beat();

        Nail n1=new Clock();
        n1.beat();

        Samosa samosa=new Samosa(nail);
        samosa.display();

        Samosa samosa1=new Samosa(n1);
        samosa1.display();
    }
}
