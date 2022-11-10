package com.himank.creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer getComputer(String type) {
        return type.equals("Production") ? new ProductionServer(this.ram, this.hdd, this.cpu) : new QAServer(this.ram, this.hdd, this.cpu);
    }
}
