package exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		int skill;
		double hours;
		double insurance;
		double retirement = 0;
		double rate = 0;
		double grossPay;
		double regPay = 0;
		double retirePercent = 0;
		double netPay;
		double insurOption = 0;
		double overtimePay = 0;
		double finalPay = 0;
		double insurMoney = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is your skill level?");
		skill = input.nextInt();
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
		else if(skill == 2)
		{
			rate = 20;
		}
		else if(skill == 3)
		{
			rate = 22;
		}
		if(hours <= 40)
		{
		regPay = hours * rate;
		overtimePay = 0;
		}
		else if(hours >= 40)
		{
		regPay = 40 * rate;
		overtimePay = (hours - 40) * (rate * 1.5);
		}
		grossPay = regPay + overtimePay;
		if(retirement == 1)
		{
		retirePercent = (3 * grossPay) / 100;	
		}
		else
		{
			retirePercent = 0;
		}
		netPay = grossPay - retirePercent;
		
		if(skill >= 1)
		{
			if(insurOption == 1)
			{
				insurMoney = 32.5;
			}
			else if(insurOption == 2)
			{
				insurMoney = 20;
			}
			else if(insurOption == 3)
			{
				insurMoney = 10;
			}
			
		}
		finalPay = netPay - insurMoney;
		if(finalPay <= 0)
		{
			System.out.print("Error: deductions exceed gross pay");
		}
		else
		{
			System.out.print("Hours: " + hours + " Rate: " + rate + " Regular pay: " + regPay 
					+ " Overtime pay: "+ overtimePay + " Total pay:" + grossPay + " Total deductions " +
					(retirePercent + insurMoney) + " Net pay: " + finalPay);
		}
		
	}

}
