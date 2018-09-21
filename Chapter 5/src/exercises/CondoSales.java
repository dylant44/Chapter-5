package exercises;

import java.util.Scanner;

public class CondoSales 
{

	public static void main(String[] args) 
	{
		String result;
		int condoChoice;
		
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("Pick a condo, press 1 for a park view, 2 for a golf course view, or 3 for a lake view\n"
				+ "to quit type 999");
		condoChoice = input.nextInt();
		
		
		if(condoChoice == 1)
		{
			result = "Park view condos are $150,000";
		}
		else if(condoChoice == 2)
		{
			result = "Golf course view condo's are $170,000";
		}
		else if(condoChoice == 3)
		{
			result = "Lake view condos are $210,000";
		}
		else 
		{
			result = "That is not a choice";
		}
		displayMessage(result);
		}while(condoChoice != 999);
		
	}
public static void displayMessage(String result)
{
	System.out.println(result);
}
}
