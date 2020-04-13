import java.util.Scanner;
/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in); // Scanner variable
		
		final int NUMBER = 2; // number of scores
		//int score1 = 100;  first test score
		//int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		
		int score1, score2; //Initialize score 1 and 2
		System.out.println("Input the first score"); //Prompt for score 1
		score1 = scan.nextInt(); //Sets score 1 to user input
		System.out.println("Input the second score"); //Prompt for score 2
		score2 = scan.nextInt(); //Sets score 2 to user input
		
		average = (double)(score1 + score2) / NUMBER ;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = ((double)5/9) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println("Input the temperature in Fahrenheit"); //Prompt for temp
		int temp = scan.nextInt(); //Initalizes and sets temp to user input
		
		fToC = (5/.9)*(.1) * (temp - 32);
		output = temp + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
	
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}