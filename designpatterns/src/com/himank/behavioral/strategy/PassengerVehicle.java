package com.himank.behavioral.strategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(IDriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
