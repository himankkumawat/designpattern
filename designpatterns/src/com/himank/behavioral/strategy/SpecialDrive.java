package com.himank.behavioral.strategy;

public class SpecialDrive implements IDriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving specially");
    }
}
