package com.himank.creational.abstractfactory;

public class ComputerFactory {

    public Computer getComputer(ComputerAbstractFactory computerAbstractFactory, String type) {
        return computerAbstractFactory.getComputer(type);
    }
}
