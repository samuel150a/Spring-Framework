package com.access.specifier.internal;

import com.access.specifier.internal.DroneController;
import com.access.specifier.external.DroneService;

public class RunnerDrone {
    public static void main(String[] args) {
        DroneController droneController = new DroneController();
        droneController.accessDrone();

        DroneService droneService = new DroneService();
        droneService.externalAccess();
    }
}
