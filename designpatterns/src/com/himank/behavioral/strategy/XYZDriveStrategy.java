package com.himank.behavioral.strategy;

public class XYZDriveStrategy implements IDriveStrategy {

    @Override
    public void drive() {
        System.out.println("new XYZ drive strategy..");
    }
}
