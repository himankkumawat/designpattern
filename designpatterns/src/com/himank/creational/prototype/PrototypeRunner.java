package com.himank.creational.prototype;

public class PrototypeRunner {

    public static void main(String[] args) {
        GameRegistry registry = new GameRegistry();

        Cricket cricket = (Cricket) registry.getGame(GameType.CRICKET);
        Football football = (Football) registry.getGame(GameType.FOOTBALL);

        System.out.println(cricket);
        System.out.println(football);

        cricket.setLocation("MCG");
        football.setLocation("London");

        Cricket cricket2 = (Cricket) registry.getGame(GameType.CRICKET);
        Football football2 = (Football) registry.getGame(GameType.FOOTBALL);

        System.out.println("===============================");
        System.out.println(cricket);
        System.out.println(football);
        System.out.println("===============================");
        System.out.println(cricket2);
        System.out.println(football2);
    }
}
