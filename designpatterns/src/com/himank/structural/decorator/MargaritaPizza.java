package com.himank.structural.decorator;

public class MargaritaPizza extends BasePizza {

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String desc() {
        return "Margarita Pizza";
    }
}
