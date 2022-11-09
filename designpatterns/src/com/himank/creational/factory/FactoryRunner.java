package com.himank.creational.factory;

public class FactoryRunner {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
    }
}
