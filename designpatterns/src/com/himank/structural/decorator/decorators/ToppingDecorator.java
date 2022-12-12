package com.himank.structural.decorator.decorators;

import com.himank.structural.decorator.BasePizza;

public abstract class ToppingDecorator extends BasePizza {

    BasePizza pizza;

    public ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract int cost();
}
