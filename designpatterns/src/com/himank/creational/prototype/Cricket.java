package com.himank.creational.prototype;

public class Cricket extends Game {

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
        System.out.println("Playing Cricket at location: " + getLocation());
    }

    @Override
    public String toString() {
        return "Cricket{ " + "location = " + location + "}";
    }

    /*  public Cricket clone() throws CloneNotSupportedException {
        return (Cricket) super.clone();
    }*/
}
