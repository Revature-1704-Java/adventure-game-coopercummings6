package com.revature.Game;

import java.util.Scanner;

public class Parser
{
    public String getCommand()//prompts user for a direction to travel and returns a string containing the direction
    {   
        String command = "";                    //store user input
        Scanner in = new Scanner(System.in);    //needed to get input from user
            boolean validInput = false;         //assume user gave an input that is invalid
            do                                  //do while input is invalid
            {
                System.out.println("Which direction do you go");//prompt user for and retrieve input
                command = in.nextLine();
                if(command.equalsIgnoreCase("North"))//next several lines check if the input is one of the accepted commands, marks input as valid if so and uses a string that is predictable to reduce code checking capitalization
                {
                    validInput = true;
                    command = "North";
                }
                if(command.equalsIgnoreCase("South"))
                {
                    validInput = true;
                    command = "South";
                }
                if(command.equalsIgnoreCase("East"))
                {
                    validInput = true;
                    command = "East";
                }
                if(command.equalsIgnoreCase("West"))
                {
                    validInput = true;
                    command = "West";
                }
            }while(validInput != true);
        //in.close();             //closing scanner also closes System.in, preventing its use later
        return command;
    }
}