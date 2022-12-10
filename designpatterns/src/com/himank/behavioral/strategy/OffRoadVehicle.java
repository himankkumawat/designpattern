package com.himank.behavioral.strategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(IDriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
