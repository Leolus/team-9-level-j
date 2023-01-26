package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    public static String DEFAULT_NAME;
    String name;

    public Character(){}

    public Character(String name){
        this.DEFAULT_NAME=name;
    }

    public String getName(){
        return this.DEFAULT_NAME;
    }

    public void enterMap(){}
    
    public void getPosition(){}
    public move(DIRECTION direction){}
}
