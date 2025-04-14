package com.samuel.work;

public class MotorFactory {
    public MotorFactory() {
        System.out.println("Running the MotorFactory constructor");
    }

    public void show(Motor66 motor) {
        if (motor != null) {
            motor.rotate();
            if (motor instanceof ElectricMotor66) {
                ElectricMotor66 ref = (ElectricMotor66) motor;
                ref.chargeBattery();
            } else {
                System.out.println("Motor66 is not an instance of ElectricMotor66, cannot call cascaded method");
            }
        } else {
            System.out.println("Motor66 is null");
        }
    }
}
