package practice;

import java.util.Scanner;

public class DoorGame 
{

	public static void main(String[] args) 
	{
		
		int doorChoice;
		int chestChoice;
		int bookChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door. \n1- for door One\n2 for door Two\n3 for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1)
			
		{
			System.out.println("Door 1 good choice choose aong the following chests.");	
			System.out.println("1- For Chest One/n2- For Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) 
			{
				result = "Pile of gold";	
			}
			else if(chestChoice == 2) 
			{
			result = "Nothing";
			}
			else 
			{
				result = "Nothing I said 1 or 2";
			}
			
		}
		else if(doorChoice == 2)
		{
			result = "A donkey";
		}
		else if(doorChoice == 3)
		{
			result = "Barely competant cashier and you're 3rd in line";
		}
		else if(doorChoice == 999) 
		{
			result = ("You enter a special room with 3 books on the table, there are no words on the +"
		+ "cover. Do you choose Book 1, Book 2, or Book 3?");
			bookChoice = input.nextInt();
			if(bookChoice == 1)
			{
				result = "you die";
			}
			else if(bookChoice == 2)
			{
				result = "You go blind";
			}
			else if(bookChoice == 3)
			{
				result = "You find a map to get out";
			}
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
