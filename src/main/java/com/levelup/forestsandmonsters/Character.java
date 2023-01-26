package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    public static String DEFAULT_NAME;
    String name;

    public Character() {
    }

    public Character(String name) {
        this.DEFAULT_NAME = name;
    }

    public String getName() {
        return this.DEFAULT_NAME;
    }

    public void enterMap(GameMap gameMap) {
    }

    public Position getPosition() {
        return null;
    }

    public void move(DIRECTION direction) {
    }

    public Object getMoveCount() {
        return null;
    }
}
