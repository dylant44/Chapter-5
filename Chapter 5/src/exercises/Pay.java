package exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		double skill;
		double hours;
		double insurance;
		double retirement = 0;
		double rate = 0;
		double grossPay;
		double retirePercent;
		double netPay;
		double insurOption;
		double overtPay;
		double finalPay;
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is your skill level?");
		skill = input.nextDouble();
		System.out.print("How many hours did you work?");
		hours = input.nextDouble();
		if(skill >= 1)
		{
		System.out.print("Which insurance do you have?");
		insurance = input.nextDouble();
		}
		if(skill == 3)
		{
			System.out.print("Would you like to participate in retirement saving? 1 for yes, 2 for no");
			retirement = input.nextDouble();
		}
		
		
		if(skill == 1)
		{
			rate = 17;
		}
		if(skill == 2)
		{
			rate = 20;
		}
		if(skill == 3)
		{
			rate = 22;
		}
		grossPay = hours * rate;
		
		if(retirement == 1)
		{
		retirePercent = (3 * grossPay) / 100;	
		}
		
		
		
	}

}
