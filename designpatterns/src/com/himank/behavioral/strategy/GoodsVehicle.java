package com.himank.behavioral.strategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(IDriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
