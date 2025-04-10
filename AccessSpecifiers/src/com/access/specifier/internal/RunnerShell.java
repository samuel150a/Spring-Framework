package com.access.specifier.internal;

import com.access.specifier.internal.ShellBox;
import com.access.specifier.external.ShellStore;

public class RunnerShell {
    public static void main(String[] args) {
        ShellBox shellBox = new ShellBox();
        shellBox.accessShell();

        ShellStore shellStore = new ShellStore();
        shellStore.displayShell();
    }
}
