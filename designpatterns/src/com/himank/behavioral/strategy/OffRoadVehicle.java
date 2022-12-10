package com.himank.behavioral.strategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
