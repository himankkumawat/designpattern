package com.himank.behavioral.strategy;

public class StrategyRunner {

    public static void main(String[] args) {

        Vehicle passengerVehicle = new PassengerVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        Vehicle sportyVehicle = new SportyVehicle();

        passengerVehicle.drive();
        offRoadVehicle.drive();
        sportyVehicle.drive();

        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();
    }
}
