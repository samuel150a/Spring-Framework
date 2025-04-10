package com.access.specifier.internal;

import com.access.specifier.internal.PerfumeShelf;
import com.access.specifier.external.PerfumeShop;

public class RunnerPerfume {
    public static void main(String[] args) {
        PerfumeShelf perfumeShelf = new PerfumeShelf();
        perfumeShelf.accessPerfume();

        PerfumeShop perfumeShop = new PerfumeShop();
        perfumeShop.displayPerfume();
    }
}
