package com.himank.behavioral.strategy;

public class SportyVehicle extends Vehicle {

    public SportyVehicle() {
        super(new SpecialDrive());
    }
}
