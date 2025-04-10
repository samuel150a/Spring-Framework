package com.access.specifier.internal;

public class ShellBox {

    public ShellBox() {
        System.out.println("ShellBox constructor is running");
    }

    public void accessShell() {
        Shell shell = new Shell();
        shell.crack();
        shell.shine();
    }
}
