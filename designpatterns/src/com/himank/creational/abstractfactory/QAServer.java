package com.himank.creational.abstractfactory;

public class QAServer extends Computer{

    private String ram;
    private String hdd;
    private String cpu;

    public QAServer(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}
