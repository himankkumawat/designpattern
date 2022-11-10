package com.himank.creational.prototype;

public class Football extends Game {
    private String location;

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void playGame() {
        System.out.println("Playing Football at location: " + getLocation());
    }

    @Override
    public String toString() {
        return "Football{ " + "location = " + location + "}";
    }

    /*public Football clone() throws CloneNotSupportedException {
        return (Football) super.clone();
    }*/
}
