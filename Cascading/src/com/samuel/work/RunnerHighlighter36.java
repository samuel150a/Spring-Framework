package com.samuel.work;

public class RunnerHighlighter36 {
    public static void main(String[] args) {
        Highlighter36 highlighter = new Highlighter36();
        highlighter.highlight(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Highlighter36 fluorescentHighlighter = new FluorescentHighlighter36();
        fluorescentHighlighter.highlight(); // RUNTIME POLYMORPHISM

        FluorescentHighlighter36 fh36 = new FluorescentHighlighter36();
        fh36.highlight(); // NORMALLY ACCESSING CHILD CLASS METHOD
        fh36.glow();

        HighlighterBox box = new HighlighterBox();
        box.show(highlighter);
        box.show(fh36);
    }
}
