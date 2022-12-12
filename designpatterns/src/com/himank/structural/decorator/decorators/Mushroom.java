package com.himank.structural.decorator.decorators;

import com.himank.structural.decorator.BasePizza;

public class Mushroom extends ToppingDecorator {

    public Mushroom(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }

    @Override
    public String desc() {
        return pizza.desc() + " with mushroom";
    }
}
