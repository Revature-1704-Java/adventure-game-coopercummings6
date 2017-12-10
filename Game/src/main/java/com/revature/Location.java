package com.revature;

interface Location
{
    //This method should display a description of the location that the user will see upon entering
    //the location from any direction
    public void displayDescription();

    //This returns whether the location contains a grue or other trap that would cause the player to lose the game.
    public boolean isGrueHere();

    //This returns whether the location contains an exit or other condition that would cause the player to win the game.
    public boolean isExitHere();

    //A location should be capable of having at least two neighboring locations, so that the player can progress from location to location
    //although more than two is needed for non-linear progression.
    public void setNorthNeighbor(Location newNeighbor);
    public void setSouthNeighbor(Location newNeighbor);

    public Location getNorthNeighbor();
    public Location getSouthNeighbor();
}
