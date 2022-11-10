package com.himank.creational.abstractfactory;

public abstract class Computer {

    public abstract String getRam();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString(){
        return "Object of: " +this.getClass().getSimpleName() + " RAM = " + getRam() + ", HDD = " + getHDD() + ", CPU = " + getCPU();
    }
}
