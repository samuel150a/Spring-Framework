package com.samuel.work;

public class RunnerTestPaper98 {
    public static void main(String[] args) {
        TestPaper98 testPaper = new TestPaper98();
        testPaper.examine(); // PARENT CLASS METHOD

        TestPaper98 mathTestPaper = new MathTestPaper98();
        mathTestPaper.examine(); // RUNTIME POLYMORPHISM

        MathTestPaper98 mtp = new MathTestPaper98();
        mtp.examine(); // CHILD CLASS METHOD
        mtp.solveProblems();

        TestPaperStore store = new TestPaperStore();
        store.show(testPaper);
        store.show(mtp);
    }
}
