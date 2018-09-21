package gameZone;

import java.util.Scanner;


public class randomGuess2 
{

	public static void main(String[] args) 
	{
		int userGuess;
		int computerSecret; 
		int quit;
		
		String result = null;
		
		computerSecret = (int )(Math.random() * 10 + 1);
		
		Scanner input = new Scanner(System.in);
		
		do 
		{
		
		System.out.print("Pick a number between 1 and 10 >> ");
		userGuess = input.nextInt();
		
		if (userGuess == computerSecret)
		{
			result = "You win";
		}
		else if(userGuess <= computerSecret)
		{
			result = "Too low";
		}
		else if(userGuess >= computerSecret) 
		{
			result = "Too high";
		}
		displayMessage(result);
		System.out.println("Do you want to quit? 1 for yes 2 for no >> ");
		quit = input.nextInt();
		}while(1 != quit || userGuess == computerSecret);
	}
public static void displayMessage(String result)
{
	System.out.println(result);
}
}
