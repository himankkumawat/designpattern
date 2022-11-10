package com.himank.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {

    private Map<GameType, Game> games = new HashMap<>();

    public GameRegistry() {
        this.initialize();
    }

    public Game getGame(GameType gameType) {
        try {
            return this.games.get(gameType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void initialize() {

        // We can get these model object from DB as well.
        Cricket cricket = new Cricket();
        cricket.setLocation("Lords Cricket ground");

        Football football = new Football();
        football.setLocation("Barcelona");

        this.games.put(GameType.CRICKET, cricket);
        this.games.put(GameType.FOOTBALL, football);
    }
}
