package com.revature;

public class Room implements Location
{
	private String description;
	private Location NorthNeighbor = null;
	private Location SouthNeighbor = null;
	private Location EastNeighbor = null;
	private Location WestNeighbor = null;
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
	public void setNorthNeighbor(Location newNeighbor){NorthNeighbor = newNeighbor;}
	public void setSouthNeighbor(Location newNeighbor){SouthNeighbor = newNeighbor;}
	public void setEastNeighbor(Location newNeighbor){EastNeighbor = newNeighbor;}
	public void setWestNeighbor(Location newNeighbor){WestNeighbor = newNeighbor;}

	//getters for neighbors, might return null if there is no neighbor
	public Location getNorthNeighbor(){return NorthNeighbor;}
	public Location getSouthNeighbor(){return SouthNeighbor;}
	public Location getEastNeighbor(){return EastNeighbor;}
	public Location getWestNeighbor(){return WestNeighbor;}
}