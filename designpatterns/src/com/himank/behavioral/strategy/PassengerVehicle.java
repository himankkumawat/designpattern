package com.himank.behavioral.strategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
