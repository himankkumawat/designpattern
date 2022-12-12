package com.himank.structural.decorator.decorators;

import com.himank.structural.decorator.BasePizza;

public class Extracheese extends ToppingDecorator {

    public Extracheese(BasePizza pizza) {
        super(pizza);
    }
    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }

    @Override
    public String desc() {
        return pizza.desc() + " with extra cheese";
    }
}
