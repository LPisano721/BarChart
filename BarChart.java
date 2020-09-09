// Filename: BarChart.java
// Written by: Luigi Pisano
// Written on: August 27 2020

// import statement to allow us the use of the util.Scanner
import java.util.Scanner;

// class header
public class BarChart
{
	// main method header
	public static void main(String[] args)
	// public is an access specifier
	// static means that this method works without instanciating an object of the class
	// void is the method's return type
	// main means that this needs no other classes to run
	// String is a class. Any arguments to this method must be String objects.
	// args is the name of the arguement (used 99% of the time)
	{

		// VARIABLE(s) and CONSTANT(s)
		int artPoints;
		int bobPoints;
		int calPoints;
		int danPoints;
		int eliPoints;

		// INPUT(s)
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the points earned by Art: ");
		artPoints = input.nextInt();

		System.out.print("Please enter the points earned by Bob: ");
		bobPoints = input.nextInt();

		System.out.print("Please enter the points earned by Cal: ");
		calPoints = input.nextInt();

		System.out.print("Please enter the points earned by Dan: ");
		danPoints = input.nextInt();

		System.out.print("Please enter the points earned by Eli: ");
		eliPoints = input.nextInt();

		// CALCULATION
		
		// OUTPUT(s)
		System.out.println();
		System.out.println("Points Earned This Game:");
		displayPoints("Art",artPoints);
		displayPoints("Bob",bobPoints);
		displayPoints("Cal",calPoints);
		displayPoints("Dan",danPoints);
		displayPoints("Eli",eliPoints);

	}

	// METHOD that generates the asterisk characters for the bar chart
	public static void displayPoints(String name, int points)
	{
		System.out.print("\n" + name + ": ");

		for(int x = 1; x <= points; ++x)
		{
			System.out.print("*");
		}
	}
}