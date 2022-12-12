package com.himank.structural.decorator;

import com.himank.structural.decorator.decorators.Extracheese;
import com.himank.structural.decorator.decorators.Mushroom;

public class DecoratorRunner {

    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new Extracheese(new VegDelight()));
        System.out.println(pizza.desc());
        System.out.println("Pizza cost is: " + pizza.cost());
    }
}
