package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    public static String DEFAULT_NAME="Jon Snow";
    String name;
    GameMap map = null;
    Position currentPosition = null;
    int moveCount = 0;

    //default constructor
    public Character() {
        this.name = DEFAULT_NAME;
    }
    

    //Constructor with String name
    public Character(String name) {
        if(name.trim().equals(""))
            this.name = DEFAULT_NAME;
        else
            this.name = name;
    }

    public String getName() {
        return Character.DEFAULT_NAME;
    }

    public void setName(String name){
        Character.DEFAULT_NAME=name;
    }

    //Instantiate GameMap obj
    //GameMap gameMap = new GameMap();

    public void enterMap(GameMap map) {
        this.map = map;
        this.currentPosition = map.startingPosition;
    }

    public Position getPosition() {
        return currentPosition;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void move(DIRECTION direction) {
        this.currentPosition = map.calculatePosition(this.currentPosition, direction);
        moveCount++;
    }

}
