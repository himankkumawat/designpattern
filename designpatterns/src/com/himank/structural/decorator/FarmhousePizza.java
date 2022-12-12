package com.himank.structural.decorator;

public class FarmhousePizza extends BasePizza {

    @Override
    public int cost() {
        return 120;
    }

    @Override
    public String desc() {
        return "Farmhouse Pizza";
    }
}
