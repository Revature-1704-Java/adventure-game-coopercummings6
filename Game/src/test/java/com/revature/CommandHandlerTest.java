package com.revature;

import org.junit.Test;
import static org.junit.Assert.*;

/*
Unit tests for command handler
*/
public class CommandHandlerTest
{
    /**
     * check that commands correctly return null if no room exists in direction
     */
    @Test
    public void cannotGoNorth()
    {
        Room curRoom = new Room("",false,false);//neighbors default to null
        CommandHandler ch = new CommandHandler();
        assertNull(ch.nextRoom("North", curRoom));
    }
    @Test
    public void cannotGoSouth()
    {
        Room curRoom = new Room("",false,false);//neighbors default to null
        CommandHandler ch = new CommandHandler();
        assertNull(ch.nextRoom("South", curRoom));
    }
    @Test
    public void cannotGoEast()
    {
        Room curRoom = new Room("",false,false);//neighbors default to null
        CommandHandler ch = new CommandHandler();
        assertNull(ch.nextRoom("East", curRoom));
    }
    @Test
    public void cannotGoWest()
    {
        Room curRoom = new Room("",false,false);//neighbors default to null
        CommandHandler ch = new CommandHandler();
        assertNull(ch.nextRoom("West", curRoom));
    }


    /*
    check that command correctly returns next room if one exists
    */
    @Test
    public void goNorth()
    {
        Room curRoom = new Room("",false,false);//neighbors default to null
        Room roomAfter = new Room("",false,false);
        curRoom.setNorthNeighbor(roomAfter);
        CommandHandler ch = new CommandHandler();
        assertEquals(ch.nextRoom("North", curRoom), roomAfter);
    }
    @Test
    public void goSouth()
    {
        Room curRoom = new Room("",false,false);//neighbors default to null
        Room roomAfter = new Room("",false,false);
        curRoom.setSouthNeighbor(roomAfter);
        CommandHandler ch = new CommandHandler();
        assertEquals(ch.nextRoom("South", curRoom), roomAfter);
    }
    @Test
    public void goEast()
    {
        Room curRoom = new Room("",false,false);//neighbors default to null
        Room roomAfter = new Room("",false,false);
        curRoom.setEastNeighbor(roomAfter);
        CommandHandler ch = new CommandHandler();
        assertEquals(ch.nextRoom("East", curRoom), roomAfter);
    }
    @Test
    public void goWest()
    {
        Room curRoom = new Room("",false,false);//neighbors default to null
        Room roomAfter = new Room("",false,false);
        curRoom.setWestNeighbor(roomAfter);
        CommandHandler ch = new CommandHandler();
        assertEquals(ch.nextRoom("West", curRoom), roomAfter);
    }

    /*
    even though commands should be validated before being passed to the command handler, check that no room is returned when an invalid
    command is passed (should return an unexpected null and cause the program to ask for a new input, or crash if it was not properly dealt with)
    */
    @Test
    public void invalidInput()
    {
        Room curRoom = new Room("",false,false);
        CommandHandler ch = new CommandHandler();
        assertNull(ch.nextRoom("Nroth", curRoom));//command was misspelled, so it is invalid
    }
}