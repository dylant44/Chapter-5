package exercises;

import java.util.Scanner;

public class DelgadosTacosChoice {

	public static void main(String[] args) {
		
		int choice1;
		Scanner input = new Scanner(System.in);
		System.out.print("Please choose 1 for a taco or 2 for a burrito");
		choice1 = input.nextInt();
		
		if(choice1 == 1)
		{
			System.out.print("You chose a taco");
		}
		else if(choice1 == 2)
		{
			System.out.print("You chose a burrito");
		}
		else if(choice1 >= 3 && choice1 <= 999)
		{
			System.out.print("I said 1 or 2, not " + choice1);
		}
		else if(choice1 >= 1000 && choice1 <= 9999)
		{
			System.out.print("You are wrong because " + choice1 + " is not 1 or 2");
		}
		else if(choice1 >= 10000)
		{
			System.out.print("If you go any higher than 2147000000 the program will not work " + 
		"because integer data types cant hold that big of a number");
		
		}
		
	}

}
