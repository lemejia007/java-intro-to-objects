
// Assignment03.java
// This program calculates and displays how much a person would earn over a user 
// entered period of time (MIN-MAX possible days) if his/her salary is one penny 
// the first day, two the second, and continues to double each day. 

// Import declarations
import java.util.Scanner;    // This program makes use of the Scanner class
import java.math.BigDecimal; // This program makes use of the BigDecimal class

public class Assignment03 {
	
	// Constants
	private static final int MIN = 1;  // Minimum number of days allowed to work 
	private static final int MAX = 45; // Maximum number of days allowed to work
	private static final double STARTING_SALARY = 0.01;

	// Main method
	public static void main(String[] args) {
		
		// Create a Scanner object to obtain user input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for the amount of days worked between MIN and MAX
		System.out.printf("%n%s%nEnter an integer between %d and %d: ", 
				              "For how many days will the pay double?", MIN, MAX);
		
	  // Validate user input to make sure input is an integer between MIN and MAX
		while (!input.hasNextInt()) {  	
			// User did not enter an integer. Re prompt user
			System.out.printf("%nEnter an integer between %d and %d%n", MIN, MAX);
		  input.next(); 			
		}
		
	  // Store user input for days worked
		int daysWorked = input.nextInt();
		
	  // Validate user input to make sure input is an integer between MIN and MAX
		while ((daysWorked < 1) || (daysWorked > 45)) {
			// User did not enter an integer. Re prompt user
			System.out.printf("%nEnter an integer between %d and %d%n", MIN, MAX);
			daysWorked = input.nextInt(); 
		} 
		
		// Close Scanner object
		input.close();
		
		// Begin processing and outputting user input
		System.out.printf("%-16s%-17s%n------------------------------%n", 
			              	"Day", "Total Pay");
		System.out.printf("%-16d$%16.2f%n", 1, STARTING_SALARY);
		
		// Declare and initialize BigDecimal variables to work with 
		BigDecimal total         = BigDecimal.ZERO;
		BigDecimal currentSalary = BigDecimal.valueOf(STARTING_SALARY);
		BigDecimal timesTwo      = BigDecimal.valueOf(2.00);
		
		for (int i = 2; i <= daysWorked; i++) {
		  // Output earnings per day worked ( running total )
			currentSalary = currentSalary.multiply(timesTwo);
			System.out.printf("%-16d$%16.2f%n", i, currentSalary);
			// Calculate total
			total = currentSalary.add(total);	
		}
		
	  // Output total
		System.out.printf("%s%n%-16s$%16.2f", "---------------------------------" 
				                                , "Total", total.doubleValue());	
	}

}

