package exercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) 
	{
		String result = null;
		int talkMins;
		int texts;
		int data;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many talk minutes do you use a month?");
		talkMins = input.nextInt();
		System.out.println("How many texts do you send a month?");
		texts = input.nextInt();
		System.out.println("How much data do you use a month?");
		data = input.nextInt();
		
		if(talkMins <=500 && texts == 0 && data == 0)
		{
			result = "The best plan for you would be plan A at $49 per month";
		}
		else if(talkMins <= 500 && texts >= 0) 
		{
			result = "The best plan for you would be plan B at $55 per month";
		}
		else if(talkMins >= 500 && data == 0)
		{
			result = "The best plan for you would either be plan C for up to 100 texts per month +"
					+ "at $61 per month or plan D for over 100 texts at $70per month";
		}
		else if(data == 0)
		{
			result = "The best plan for you would either be plan E for up to 2 gigabytes of data at $79 +"
					+ "or plan F for 2 or moe gigabytes at $87 per month";
		}
		
		displayMessage(result);
	}
	
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}

}
