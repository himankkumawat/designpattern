package com.himank.behavioral.strategy;

public class NormalDrive implements IDriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving normally.");
    }
}
