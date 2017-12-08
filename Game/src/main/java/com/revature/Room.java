package com.revature;

public class Room
{
	private String description;
	private Room NorthNeighbor = null;
	private Room SouthNeighbor = null;
	private Room EastNeighbor = null;
	private Room WestNeighbor = null;
	private boolean hasExit;
	private boolean hasGrue;

	//initialize room with description and whether it has neighbors to its north, south, east, and west
	public Room(String description, boolean hasGrue, boolean hasExit)
	{
		this.description = description;
		this.hasGrue = hasGrue;
		this.hasExit = hasExit;
	}

	//displays a description of the contents of the room object and (possibly) what happens when the player enters
	public void displayDescription()
	{
		System.out.println(description);
	}

	//returns whether a Grue (or other cause of a fail state) is in the this instance of the room class
	public boolean isGrueHere()
	{
		return this.hasGrue;
	}

	//returns whether an exit is in the this instance of the room class
	public boolean isExitHere()
	{
		return this.hasExit;
	}

	//setters for neighbors
	public void setNorthNeighbor(Room newNeighbor){NorthNeighbor = newNeighbor;}
	public void setSouthNeighbor(Room newNeighbor){SouthNeighbor = newNeighbor;}
	public void setEastNeighbor(Room newNeighbor){EastNeighbor = newNeighbor;}
	public void setWestNeighbor(Room newNeighbor){WestNeighbor = newNeighbor;}

	//getters for neighbors, might return null if there is no neighbor
	public Room getNorthNeighbor(){return NorthNeighbor;}
	public Room getSouthNeighbor(){return SouthNeighbor;}
	public Room getEastNeighbor(){return EastNeighbor;}
	public Room getWestNeighbor(){return WestNeighbor;}
}