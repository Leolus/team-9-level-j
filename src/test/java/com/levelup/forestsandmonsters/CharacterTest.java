package com.levelup.forestsandmonsters;

import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;;

public class CharacterTest {
    @Test
    public void enterMapResults() {
        Character character = new Character();
        GameMap mapObj =  new GameMap();
        character.enterMap(mapObj);
        assertEquals(mapObj, character.map);
    }

    @Test
    public void getPosition(){
        Character c = new Character();
        assertNotNull(c.getPosition());
    }
}
