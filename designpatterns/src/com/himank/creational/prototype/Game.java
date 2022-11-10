package com.himank.creational.prototype;

public abstract class Game implements Cloneable{

    abstract void setLocation(String name);

    abstract String getLocation();

    abstract void playGame();

    public Game clone() throws CloneNotSupportedException{
       return (Game) super.clone();
    }
}
