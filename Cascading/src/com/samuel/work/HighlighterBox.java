package com.samuel.work;

public class HighlighterBox {
    public HighlighterBox() {
        System.out.println("Running the HighlighterBox constructor");
    }

    public void show(Highlighter36 highlighter) {
        if (highlighter != null) {
            highlighter.highlight();
            if (highlighter instanceof FluorescentHighlighter36) {
                FluorescentHighlighter36 ref = (FluorescentHighlighter36) highlighter;
                ref.glow();
            } else {
                System.out.println("Highlighter36 is not an instance of FluorescentHighlighter36, cannot call cascaded method");
            }
        } else {
            System.out.println("Highlighter36 is null");
        }
    }
}
