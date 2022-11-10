package com.himank.creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer getComputer(String type) {
        return type.equals("Desktop") ? new Desktop(this.ram, this.hdd, this.cpu) : new Laptop(this.ram, this.hdd, this.cpu);
    }
}
