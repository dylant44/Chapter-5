package practice;

import java.util.Scanner;

public class AgeGame 
{

	public static void main(String[] args) 
	{
		int usersAge;
		String result = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		usersAge = input.nextInt();
		
		if(usersAge <= 12)
			{
				result = "You are a child! Go away!";
			}
		else if(usersAge >= 13  && usersAge <= 18)
			{
			result = "You are a snotty teen";
			}
		else if(usersAge >= 19 && usersAge <= 25)
			{
				result = "Get a job!";
			}
		else if(usersAge >= 26 && usersAge <= 30)
			{
				result = "You're old";
			}
		else if(usersAge >= 31 && usersAge <= 40)
			{
				result = "You're really old";
			}
		else if(usersAge >= 41 && usersAge <= 50)
			{
				result = "You're super old";
			}
		else if(usersAge >= 51 && usersAge <= 60)
			{
				result = "You're ancient";
			}
		else if(usersAge >= 61)
			{
				result = "You're probably gonna die soon";
			}
		
		
		
		displayMessage(result);
		
	}
public static void displayMessage(String result)
{
System.out.println(result);	
}



}
