package debugging;

//FixDebugFive3.java
//Determines whether item number on order is valid
//Over 999 invalid
//Less than 111 Invalid
//Valid and less than 500 - Automotive Department
//Valid and 500 or higher House wares Department

import java.util.Scanner;
public class debug3
{
public static void main (String args[])
{
   int item;
   String output;
   final int LOW = 111;
   final int HIGH = 9;
   final int CUTOFF = 500;
   Scanner input = new Scanner(System.in);
   calculateOutPut();
}
public static void calculateOutPut()
{
	Scanner input = new Scanner(System.in);
   System.out.println("Please enter item number");
   int item = input.nextInt();
   int LOW = 0;
String output;
int HIGH = 0;
int CUTOFF = 0;
if(item < LOW) 
	output = "Item number too low";
   else
if(item > HIGH)
output = "Item number too high";
   else
if(item > CUTOFF)
          output = "Valid - in Automotive Department";
       else
          output = "Valid - Item in Housewares Department";
    System.out.println(output);
}
}

