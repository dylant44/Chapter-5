package exercises;

import java.util.Scanner;

public class CondoSales 
{

	public static void main(String[] args) 
	{
		String result = null;
		int condoChoice;
		int parkingType;
		int fullPrice;
		int garagePrice = 5000;
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("Pick a condo, press 1 for a park view, 2 for a golf course view, or 3 for a lake view\n"
				+ "to quit type 999");
		condoChoice = input.nextInt();
		
		
		if(condoChoice == 1)
		{
			int condoPrice = 150000;
			System.out.print("1 for garage, 2 for parking spot");
			parkingType = input.nextInt();
			if(parkingType == 1)
			{
				fullPrice = condoPrice + garagePrice;
				result = "Park view condos with a garage are $" + fullPrice;
			}
			else if(parkingType == 2)
			{
				result = "Park view condos with a parking spot are $" + condoPrice;
			}
			
		}
		else if(condoChoice == 2)
		{
			int condoPrice = 170000;
			System.out.print("1 for garage, 2 for parking spot");
			parkingType = input.nextInt();
			if(parkingType == 1)
			{
				fullPrice = condoPrice + garagePrice;
				result = "Golf course view condos with a garage are $" + fullPrice;
			}
			else if(parkingType == 2)
			{
			result = "Golf course view condo's are $" + condoPrice;
			}
		}
		else if(condoChoice == 3)
		{
			int condoPrice = 210000;
			System.out.print("1 for garage, 2 for parking spot");
			parkingType = input.nextInt();
			if(parkingType == 1)
			{
				fullPrice = condoPrice + garagePrice;
				result = "Lake view condos with a garage are $" + fullPrice;
			}
			else if(parkingType == 2)
			{
			result = "Lake view condos are $" + condoPrice;
			}
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
