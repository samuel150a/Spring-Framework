package com.samuel.work;

public class FluorescentHighlighter36 extends Highlighter36 {
    public FluorescentHighlighter36() {
        System.out.println("Running in the FluorescentHighlighter36 constructor");
    }

    @Override
    public void highlight() {
        System.out.println("Running public method highlight by child class");
    }

    public void glow() {
        System.out.println("Running in public method glow");
    }
}
