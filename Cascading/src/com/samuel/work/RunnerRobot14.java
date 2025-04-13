package com.samuel.work;

public class RunnerRobot14 {
    public static void main(String[] args) {
        Robot14 robot = new Robot14();
        robot.work(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Robot14 aiRobot = new AI_Robot14();
        aiRobot.work(); // RUNTIME POLYMORPHISM

        AI_Robot14 air14 = new AI_Robot14();
        air14.work(); // NORMALLY ACCESSING CHILD CLASS METHOD
        air14.analyzeData();

        RobotFactory factory = new RobotFactory();
        factory.show(robot);
        factory.show(air14);
    }
}
