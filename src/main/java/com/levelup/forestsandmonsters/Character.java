package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    public static String DEFAULT_NAME = "Jon Snow";
    String name;
    GameMap map = null;
    Position currentPosition = null;
    int moveCount = 0;
    String moveDirection;

    // default constructor
    public Character() {
        this.name = DEFAULT_NAME;
    }

    // Constructor with String name
    public Character(String name) {
        if (name.trim().equals(""))
            this.name = DEFAULT_NAME;
        else
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoveDirection(String moveDirection) {
        this.moveDirection = moveDirection;
    }

    // Instantiate GameMap obj
    // GameMap gameMap = new GameMap();
    public String getMoveDirection() {
        return this.moveDirection;
    }

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
        this.moveDirection = direction.toString();
        // System.out.println("Printing the directions data"+ direction.toString());
        moveCount++;
    }
}
