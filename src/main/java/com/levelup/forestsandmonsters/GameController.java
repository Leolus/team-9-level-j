package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    Character character;
    GameMap map;

    public class GameStatus {
        public String characterName;
        public Point currentPosition;
        public int moveCount;
        public String moveDirection;

        @Override
        public String toString() {
            return "Character " + characterName + " was on position " + currentPosition.x + "," + currentPosition.y + " at move count " + moveCount+" after moving "+moveDirection;
        }
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        N, S, E, W
    }

    public void createCharacter(String name) {
        this.character = new Character(name);
        this.status.characterName = character.getName();
    }

    public void startGame() {
        map = new GameMap();
        if(character == null)
        {
            this.character = new Character();
        }
        character.enterMap(map);
        this.status.characterName = this.character.name;
        this.status.currentPosition = this.character.getPosition().coordinates;
        this.status.moveCount = this.character.getMoveCount();
        this.status.moveDirection=this.character.getMoveDirection();
    }

    public GameStatus getStatus() {
        GameStatus snapshotStatus = new GameStatus();
        snapshotStatus.characterName = this.status.characterName;
        snapshotStatus.currentPosition = this.status.currentPosition;
        snapshotStatus.moveCount = this.status.moveCount;
        snapshotStatus.moveDirection = this.status.moveDirection;
        return snapshotStatus;
    }

    public void move(DIRECTION directionToMove) {
        character.move(directionToMove);
        this.status.currentPosition = character.getPosition().coordinates;
        this.status.moveCount = character.getMoveCount();
        this.status.moveDirection=character.getMoveDirection();
    }

    //Exists for testability. Is not a system operation.
    public void setCharacterPositionAndMoveCount(Point coordinates, int moveCount) {
        if(character == null)
            this.character = new Character();
        this.character.currentPosition = new Position(coordinates.x, coordinates.y);
        this.character.moveCount = moveCount;
        this.status.characterName = this.character.name;
        this.status.currentPosition = this.character.currentPosition.coordinates;
        this.status.moveCount = this.character.moveCount;
    }

    // Exists for testability. Is not a system operation.
    public int getTotalPositions() {
        return this.map.getTotalPositions();
    }
    

}