package com.revature.Game;

import java.util.*;

public class Game
{
    public static void main(String[] args)
    {
        //instantiate rooms, moved to separate method to improve readability
        ArrayList<ArrayList<Room>> rooms = instantiateRooms();

        Room currentRoom = rooms.get(5).get(1); //tracks location, start is located at 5,1


        //begin gameplay loop, which will end when player dies or finds an exit
        while(true)
        {
            currentRoom.displayDescription();                           //describe the room

                                                                        //break if win or fail condition has been reached (breaks are needed to get loop to end after displaying description)
            if(currentRoom.isGrueHere())                                //fail condition
            {
                break;
            }
            if(currentRoom.isExitHere())                                //win condition
            {
                break;
            }

            Parser parser = new Parser();                               //create a parser object
            String command = parser.getCommand();                       //use parser to get a command

            CommandHandler ch = new CommandHandler();                   //create a commandHandler
            Room temp = ch.nextRoom(command, currentRoom);              //use the commandHandler to determine whether the command is valid (it will return null if invalit)
                                                                        //advance to next room if command is valid
            if(temp != null)                                            //cannot advance to a room that does not exist (and it would result in NullPointerExceptions)
            {
                currentRoom = temp;
            }
        }//end gameplay loop
    }//end main
}//end Game class

    public static ArrayList<ArrayList<Room>> instantiateRooms(Arrays.asList({null, null, null, null, null, null}))
    {
        ArrayList<ArrayList<Room>> rooms = new ArrayList<ArrayList<Room>>(6);//set up multidimensional arraylist to store rooms
                                                            //first coordinite gives position from west to east
                                                            //second coordinate gives position from north to south.  ((0,0) is northwest most room)
        for(int i = 0; i < 6; i++)
        {
            rooms.set(i, (new ArrayList<Room>(Arrays.asList({null, null, null, null, null, null})))); 
        }
                                                    //set first row of rooms
        (rooms.get(0)).set(0, null);        //set room at 0,0 to null
        String desc = "As you enter the room you are eaten by a Grue";
        (rooms.get(0)).set(1, new Room(desc, true, false));        //set room at 0,1 to room with grue and no exit
        desc = "The dark passageway extends both East and West. You cannot see what lies ahead of you in either direction";
        (rooms.get(0)).set(2, new Room(desc, false, false));        //set room at 0,2 to room with no grue and no exit
        desc = "You approach a fork in the path. You see passages to the East, West, and South.";
        (rooms.get(0)).set(3, new Room(desc, false, false));        //set room at 0,3 to room with no grue and no exit
        desc = "As you wander through the corridor, you see a faint light. You follow the light and see a campfire. You are then eaten by a Grue.";
        (rooms.get(0)).set(4, new Room(desc, true, false));        //set room at 0,4 to room with grue and no exit
        (rooms.get(0)).set(5, null);        //set room at 0,5 to null

        //set second row of rooms

        desc = "There is a sharp turn in the passageway, you can go South or East.";
        (rooms.get(1)).set(0, new Room(desc, false, false));        //set room at 1,0 to room with no grue and no exit
        desc = "The damp cave extends as far as you can see West and East.";
        (rooms.get(1)).set(1, new Room(desc, false, false));        //set room at 1,1 to room with no grue and no exit
        desc = "The walls of the straight passage are wet. You can go West or East.";
        (rooms.get(1)).set(2, new Room(desc, false, false));        //set room at 1,2 to room with no grue and no exit
        desc = "You come to a room with a fire in the center and an exit in each direction.";
        (rooms.get(1)).set(3, new Room(desc, false, false));        //set room at 1,3 to room with no grue and no exit
        desc = "As you walk down the passage, the floor is suddenly missing from under you when you take a step. You slide down a steep slope and land in a room. To the East you see a rock wall with hinges and a handle on it. You think this might be a secret door.";
        (rooms.get(1)).set(4, new Room(desc, false, false));        //set room at 1,4 to room with no grue and no exit
        desc = "There is a sharp turn in the passageway, you can go South or West.";
        (rooms.get(1)).set(5, new Room(desc, false, false));        //set room at 1,5 to room with no grue and no exit

        //set 3rd row of rooms

        desc = "The T shaped intersection would allow you to go North, South, or East.";
        (rooms.get(2)).set(0, new Room(desc, false, false));        //set room at 2,0 to room with no grue and no exit
        desc = "You smell food cooking as you approach a brightly lit room. Something approaches you from behind and you are struck on the head. When you wake up, you are in a giant stew pot and realize you will soon be eaten by a Grue.";
        (rooms.get(2)).set(1, new Room(desc, true, false));        //set room at 2,1 to room with grue and no exit
        (rooms.get(2)).set(2, null);        //set room at 2,2 to null
        desc = "As you walk through the tunnel, you see a light ahead. When you get closer, you realize that this is an exit.";
        (rooms.get(2)).set(3, new Room(desc, false, true));        //set room at 2,3 to room with no grue and an exit
        (rooms.get(2)).set(4, null);        //set room at 2,4 to null
        desc = "The passage extends straight ahead of you and straight behind you for the short distance you can see with the little light available.";
        (rooms.get(2)).set(5, new Room(desc, false, false));        //set room at 2,5 to room with no grue and no exit

        //set 4th row of rooms

        desc = "The tunnel slowly curves around. you could go North or East.";
        (rooms.get(3)).set(0, new Room(desc, false, false));        //set room at 3,0 to room with no grue and no exit
        desc = "This room has an exit to the North, where you see a bright light, East, and West.";
        (rooms.get(3)).set(1, new Room(desc, false, false));        //set room at 3,1 to room with no grue and no exit
        desc = "You come to a corner. You can go South or West.";
        (rooms.get(3)).set(2, new Room(desc, false, false));        //set room at 3,2 to room with no grue and no exit
        (rooms.get(3)).set(3, null);        //set room at 3,3 to null
        desc = "There is a sharp corner in the tunnel, you can go South or East.";
        (rooms.get(3)).set(4, new Room(desc, false, false));        //set room at 3,4 to room with no grue and no exit
        desc = "You find yet another sharp corner, you could go North or West.";
        (rooms.get(3)).set(5, new Room(desc, false, false));        //set room at 3,5 to room with no grue and no exit

        //set 5th row of rooms

        (rooms.get(4)).set(0, null);        //set room at 4,0 to null
        desc = "As you walk into the room from the East, you are eaten by a Grue.";
        (rooms.get(4)).set(1, new Room(desc, true, false));        //set room at 4,1 to room with grue and no exit
        desc = "As you enter the room, you see a fire and an exit in every direction.";
        (rooms.get(4)).set(2, new Room(desc, false, false));        //set room at 4,2 to room with no grue and no exit
        desc = "The three-way intersection of tunnels in this room will allow you to go South, East, or West.";
        (rooms.get(4)).set(3, new Room(desc, false, false));        //set room at 4,3 to room with no grue and no exit
        desc = "You approach a T in the tunnel, you can go North, South, or West.";
        (rooms.get(4)).set(4, new Room(desc, false, false));        //set room at 4,4 to room with no grue and no exit
        (rooms.get(4)).set(5, null);        //set room at 4,5 to null

        //set 6th row of rooms

        (rooms.get(5)).set(0, null);        //set room at 5,0 to null
        desc = "You are in a cave. You can see the entrance, which collapsed when you wandered in, and a tunnel leading East.";
        (rooms.get(5)).set(1, new Room(desc, false, false));        //set room at 5,1 to room with no grue and no exit             This is the start zone
        desc = "The tunnel begins to turn. You can go North or West.";
        (rooms.get(5)).set(2, new Room(desc, false, false));        //set room at 5,2 to room with no grue and no exit
        desc = "This room is a dead end. It contains a large rock, which is too heavy for you to move.";
        (rooms.get(5)).set(3, new Room(desc, false, false));        //set room at 5,3 to room with no grue and no exit
        desc = "As you walk through the tunnel, you hear a thumping sound that gets louder as you go. You are attacked and eaten by a grue.";
        (rooms.get(5)).set(4, new Room(desc, true, false));        //set room at 5,4 to room with grue and no exit
        (rooms.get(5)).set(5, null);        //set room at 5,5 to null

        //now that rooms all exist, set each rooms neighbors where they exist. The nonexistent neighbors will default to null. Each room has up to 4 neighbors.
        //0,0    does not exist
        //0,1
            rooms.get(0).get(1).setEastNeighbor(rooms.get(0).get(2));
        //0,2
            rooms.get(0).get(2).setEastNeighbor(rooms.get(0).get(1));
            rooms.get(0).get(2).setWestNeighbor(rooms.get(0).get(3));
        //0,3
            rooms.get(0).get(3).setSouthNeighbor(rooms.get(1).get(3));
            rooms.get(0).get(3).setEastNeighbor(rooms.get(0).get(4));
            rooms.get(0).get(3).setWestNeighbor(rooms.get(0).get(2));
        //0,4
            rooms.get(0).get(4).setWestNeighbor(rooms.get(0).get(3));
        //0,5   Does not exist

        //1,0
            rooms.get(1).get(0).setSouthNeighbor(rooms.get(1).get(1));
            rooms.get(1).get(0).setEastNeighbor(rooms.get(0).get(2));
        //1,1
            rooms.get(1).get(1).setEastNeighbor(rooms.get(1).get(0));
            rooms.get(1).get(1).setWestNeighbor(rooms.get(1).get(2));
        //1,2
            rooms.get(1).get(2).setEastNeighbor(rooms.get(1).get(1));
            rooms.get(1).get(2).setWestNeighbor(rooms.get(1).get(3));
        //1,3
            rooms.get(1).get(3).setNorthNeighbor(rooms.get(0).get(3));
            rooms.get(1).get(3).setSouthNeighbor(rooms.get(2).get(3));
            rooms.get(1).get(3).setEastNeighbor(rooms.get(1).get(4));
            rooms.get(1).get(3).setWestNeighbor(rooms.get(1).get(2));
        //1,4
            rooms.get(1).get(4).setEastNeighbor(rooms.get(1).get(5));
        //1,5
        rooms.get(1).get(5).setSouthNeighbor(rooms.get(2).get(5));
        rooms.get(1).get(5).setWestNeighbor(rooms.get(1).get(4));

        //2,0
        rooms.get(2).get(0).setNorthNeighbor(rooms.get(1).get(0));
        rooms.get(2).get(0).setSouthNeighbor(rooms.get(2).get(1));
        rooms.get(2).get(0).setEastNeighbor(rooms.get(1).get(4));
        //2,1
        rooms.get(2).get(1).setSouthNeighbor(rooms.get(3).get(1));
        rooms.get(2).get(1).setWestNeighbor(rooms.get(2).get(0));
        //2,2   does not exist
        //2,3
            rooms.get(2).get(3).setNorthNeighbor(rooms.get(1).get(3));
        //2,4   does not exist
        //2,5
            rooms.get(2).get(5).setNorthNeighbor(rooms.get(1).get(5));
            rooms.get(2).get(5).setSouthNeighbor(rooms.get(3).get(5));

        //3,0
            rooms.get(3).get(0).setNorthNeighbor(rooms.get(2).get(0));
            rooms.get(3).get(0).setEastNeighbor(rooms.get(3).get(1));
        //3,1
            rooms.get(3).get(1).setNorthNeighbor(rooms.get(2).get(1));
            rooms.get(3).get(1).setEastNeighbor(rooms.get(3).get(2));
            rooms.get(3).get(1).setWestNeighbor(rooms.get(3).get(0));
        //3,2
        rooms.get(3).get(2).setSouthNeighbor(rooms.get(4).get(2));
        rooms.get(3).get(2).setWestNeighbor(rooms.get(3).get(1));
        //3,3   does not exist
        //3,4
            rooms.get(3).get(4).setSouthNeighbor(rooms.get(4).get(4));
            rooms.get(3).get(4).setEastNeighbor(rooms.get(3).get(5));
        //3,5
            rooms.get(3).get(5).setNorthNeighbor(rooms.get(2).get(5));
            rooms.get(3).get(5).setWestNeighbor(rooms.get(3).get(4));

        //4,0   does not exist
        //4,1
            rooms.get(4).get(1).setEastNeighbor(rooms.get(4).get(2));
        //4,2
            rooms.get(4).get(2).setNorthNeighbor(rooms.get(3).get(2));
            rooms.get(4).get(2).setSouthNeighbor(rooms.get(5).get(2));
            rooms.get(4).get(2).setEastNeighbor(rooms.get(4).get(3));
            rooms.get(4).get(2).setWestNeighbor(rooms.get(4).get(1));
        //4,3
            rooms.get(4).get(3).setSouthNeighbor(rooms.get(5).get(3));
            rooms.get(4).get(3).setEastNeighbor(rooms.get(4).get(4));
            rooms.get(4).get(3).setWestNeighbor(rooms.get(4).get(2));
        //4,4
            rooms.get(4).get(4).setNorthNeighbor(rooms.get(3).get(4));
            rooms.get(4).get(4).setSouthNeighbor(rooms.get(5).get(4));
            rooms.get(4).get(4).setWestNeighbor(rooms.get(4).get(3));
        //4,5   does not exist

        //5,0   does not exist
        //5,1
            rooms.get(5).get(1).setEastNeighbor(rooms.get(5).get(2));
        //5,2
            rooms.get(5).get(2).setNorthNeighbor(rooms.get(4).get(2));
            rooms.get(5).get(2).setWestNeighbor(rooms.get(5).get(1));
        //5,3
            rooms.get(5).get(3).setNorthNeighbor(rooms.get(4).get(3));
        //5,4
        rooms.get(5).get(4).setNorthNeighbor(rooms.get(4).get(4));
        //5,5   does not exist

        return rooms;
    }

