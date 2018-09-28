package gameZone;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		int computerGuess;
		int userChoice = 0;
		String result;
		System.out.print("Rock Paper Scissors, pick 1 for Rock, 2 for Paper, or 3 for Scissors");
		Scanner input = new Scanner(System.in);
		computerGuess = (int )(Math.random() * 10 + 1);
		
		if (computerGuess == 1)
		{
			if(userChoice == 1)
			{
				result = "Tie";
			}
			else if(userChoice == 2)
			{
				result = "You win!";
			}
			else if(userChoice == 3)
			{
				result = "You lose!";
			}
		}
		if(computerGuess == 2)
		{
			if(userChoice == 1)
			{
				result = "You lose!";
			}
			else if(userChoice == 2)
			{
				result = "Tie";
			}
			else if(userChoice == 3)
			{
				result = "You win!";
			}
		if(computerGuess == 3)
		{
			if(userChoice == 1)
			{
				result = "You win!";
			}
			else if(userChoice == 2)
			{
				result = "You lose!";
			}
			else if(userChoice == 3)
			{
				result = "Tie";
			}
		
		}
		
		
		
		
		
		
	}

}
