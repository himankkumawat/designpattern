package com.himank.structural.decorator;

public class VegDelight extends BasePizza {

    @Override
    public int cost() {
        return 110;
    }

    @Override
    public String desc() {
        return "Veg Delight Pizza";
    }
}
