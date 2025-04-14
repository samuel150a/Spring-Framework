package com.samuel.work;

public class RunnerMotor66 {
    public static void main(String[] args) {
        Motor66 motor = new Motor66();
        motor.rotate(); // PARENT CLASS METHOD

        Motor66 electric = new ElectricMotor66();
        electric.rotate(); // RUNTIME POLYMORPHISM

        ElectricMotor66 em = new ElectricMotor66();
        em.rotate(); // CHILD CLASS METHOD
        em.chargeBattery();

        MotorFactory factory = new MotorFactory();
        factory.show(motor);
        factory.show(em);
    }
}
