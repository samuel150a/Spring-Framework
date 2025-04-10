package com.access.specifier.external;

import com.access.specifier.internal.Shell;

public class ShellStore {

    public ShellStore() {
        System.out.println("ShellStore constructor is running");
    }

    public void displayShell() {
        Shell shell = new Shell();
        shell.crack();
    }
}
