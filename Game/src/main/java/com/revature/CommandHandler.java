package com.revature.Game;

import java.util.Arrays;

public class CommandHandler
{
    public Room nextRoom(String command, Room currentRoom)//This will return the neighboring room in the direction specified by the provided valid command, if one exists, if not it returns null
    {
        if(command.equals("North"))//if command is go north
        {
            if(currentRoom.getNorthNeighbor() == null)//if there is not a room north of the current room
            {
                System.out.println("You can't go that way");
            }
            return currentRoom.getNorthNeighbor();//null if no room to the north, otherwisw reference to the room
        }
        if(command.equals("South"))//rest of the directions are duplicates of the logic from above
        {
            if(currentRoom.getSouthNeighbor() == null)
            {
                System.out.println("You can't go that way");
            }
            return currentRoom.getSouthNeighbor();
        }
        if(command.equals("East"))
        {
            if(currentRoom.getEastNeighbor() == null)
            {
                System.out.println("You can't go that way");
            }
            return currentRoom.getEastNeighbor();
        }
        if(command.equals("West"))
        {
            if(currentRoom.getWestNeighbor() == null)
            {
                System.out.println("You can't go that way");
            }
            return currentRoom.getWestNeighbor();
        }
        return null;//shouldn't execute, all commands that get through parser will fit an if statement
    }
}