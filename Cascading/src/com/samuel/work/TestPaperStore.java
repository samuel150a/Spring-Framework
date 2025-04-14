package com.samuel.work;

public class TestPaperStore {
    public TestPaperStore() {
        System.out.println("Running the TestPaperStore constructor");
    }

    public void show(TestPaper98 testPaper) {
        if (testPaper != null) {
            testPaper.examine();
            if (testPaper instanceof MathTestPaper98) {
                MathTestPaper98 ref = (MathTestPaper98) testPaper;
                ref.solveProblems();
            } else {
                System.out.println("TestPaper98 is not an instance of MathTestPaper98, cannot call cascaded method");
            }
        } else {
            System.out.println("TestPaper98 is null");
        }
    }
}
