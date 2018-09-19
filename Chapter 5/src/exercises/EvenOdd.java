package exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int num;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		num = input.nextInt();
		
		if(num % 2 == 0)
		{
			result = "even";
		}
		else
		{
			result = "odd";
		}
		
		displayMessage(result);
	}
	public static void displayMessage(String result)
	{
	System.out.println(result);	
	}
}
