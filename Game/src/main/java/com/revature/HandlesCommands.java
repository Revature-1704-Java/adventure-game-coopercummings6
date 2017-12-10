package com.revature;

interface HandlesCommands
{
    //Argument command contains a direction to move, valid values are "North", "South", "East", and "West".
    //validation is not necessary because a parser should already validate inputs.
    //Argument currentRoom is a Room opject pointing to the current location of the player.
    //The return value is the next room in the direction specified by the command, or null if one does not exist.
    //The method also alerts the player that they cannot travel in a direction if there is no room in that direction.
    public Room nextRoom(String command, Room currentRoom);
}