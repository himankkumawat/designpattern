package com.himank.behavioral.strategy;

public class SportyVehicle extends Vehicle {

    public SportyVehicle(IDriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
