package com.himank.behavioral.strategy;

public class StrategyRunner {

    public static void main(String[] args) {
        IDriveStrategy normalDrive = new NormalDrive();
        IDriveStrategy specialDrive = new SpecialDrive();

        Vehicle passengerVehicle = new PassengerVehicle(normalDrive);
        Vehicle offRoadVehicle = new OffRoadVehicle(specialDrive);
        Vehicle sportyVehicle = new SportyVehicle(specialDrive);

        passengerVehicle.drive();
        offRoadVehicle.drive();
        sportyVehicle.drive();

        IDriveStrategy newStrategy = new XYZDriveStrategy();
        Vehicle goodsVehicle = new GoodsVehicle(newStrategy);
        goodsVehicle.drive();
    }
}
