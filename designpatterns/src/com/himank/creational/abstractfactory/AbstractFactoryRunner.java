package com.himank.creational.abstractfactory;

public class AbstractFactoryRunner {

    public static void main(String[] args) {
        Computer desktop = new ComputerFactory().getComputer(new PCFactory("16 GB", "1024 GB", "2.4 GHz"), "Desktop");
        Computer laptop = new ComputerFactory().getComputer(new PCFactory("16 GB", "512 GB", "2.4 GHz"), "laptop");
        Computer prodServer = new ComputerFactory().getComputer(new ServerFactory("32 GB", "1024 GB", "4.8 GHz"), "Production");
        Computer QAServer = new ComputerFactory().getComputer(new ServerFactory("32 GB", "512 GB", "2.4 GHz"), "QAServer");

        System.out.println(desktop);
        System.out.println(laptop);
        System.out.println(prodServer);
        System.out.println(QAServer);
    }
}
