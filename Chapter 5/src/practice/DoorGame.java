package practice;

import java.util.Scanner;

public class DoorGame 
{

	public static void main(String[] args) 
	{
		
		int doorChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door. \n1- for door One\n2 for door Two\n3 for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1)
				{
			result = "Pile of gold";
				}
		else if(doorChoice == 2)
		{
			result = "A donkey";
		}
		else if(doorChoice == 3)
		{
			result = "Barely competant cashier and you're 3rd in line";
		}
		else
		{
			result = "That wasn't a choice";
		}
		
		
		displayMessage(result);

	}
	public static void displayMessage(String result)
	{
	System.out.println("You won " + result);	
	}
}
