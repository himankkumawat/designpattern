package com.himank.behavioral.strategy;

public class Vehicle {

    private IDriveStrategy driveStrategy;

    public Vehicle(IDriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        System.out.println(this.getClass().getSimpleName());
        this.driveStrategy.drive();
        System.out.println();
    }
}
