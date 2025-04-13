package com.samuel.work;

public class RobotFactory {
    public RobotFactory() {
        System.out.println("Running the RobotFactory constructor");
    }

    public void show(Robot14 robot) {
        if (robot != null) {
            robot.work();
            if (robot instanceof AI_Robot14) {
                AI_Robot14 ref = (AI_Robot14) robot;
                ref.analyzeData();
            } else {
                System.out.println("Robot14 is not an instance of AI_Robot14, cannot call cascaded method");
            }
        } else {
            System.out.println("Robot14 is null");
        }
    }
}
