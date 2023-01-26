package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_CHARACTER_NAME = "Character";
    

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition;
        public int moveCount;
    }

    GameStatus status;
    Character character;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
    }

    public GameStatus getStatus() {
        GameStatus snapshotStatus = new GameStatus();
        snapshotStatus.characterName = this.status.characterName;
        snapshotStatus.currentPosition = this.status.currentPosition;
        snapshotStatus.moveCount = this.status.moveCount;
        return snapshotStatus;
    }

    public void move(DIRECTION directionToMove) {
        character.move(directionToMove);
        this.status.currentPosition = character.getPosition().coordinates;
        this.status.moveCount = character.getMoveCount();
    }

    public void setCharacterPosition(Point point) {
    }

    public void setCharacterPositionAndMoveCount(Point point, int startingMoveCount) {
    }

}
