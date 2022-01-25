
// MonthDayDriver.java
// This class is a driver class for class MonthDay. The program will prompt the 
// user for a month and a year first before evaluating and outputting the number 
// of days in the user specified month.

// Import declarations
import java.util.Scanner; // This class uses a Scanner object to collect input

// Class MonthDayDriver
public class MonthDayDriver {

	// Main method
	public static void main(String[] args) {
		
		// Create a new Scanner object to obtain input from the user
		Scanner scan = new Scanner(System.in);
		
		// Prompt user for the month
		System.out.print("\nEnter an integer number from 1 to 12 for the month \n" + 
		                   "(1=January, 2=February, ..., 12=December): ");
		
	  // Validate user input to make sure it is an integer from 1 and 12
		while (!scan.hasNextInt()) {  	
		  // User did not enter an integer. Re prompt user
			System.out.printf("%nEnter an integer between %d and %d%n", 1, 12);
			scan.next(); 			
		} 
				
		// Store user input for month 
		int month = scan.nextInt();
				
		// Validate user input to make sure it is an integer from 1 to 12
		while ((month < 1) || (month > 12)) {
		  // User did not enter an integer from 1 to 12. Re prompt 
			System.out.printf("%nEnter an integer between %d and %d: ", 1, 12);
			month = scan.nextInt(); 
		}		
		
		// Prompt user for the year
		System.out.print("\nEnter a year starting from year 1 up to year 1000000: ");
		
	  // Validate user input to make sure it is an integer from 1 and 1000000
		while (!scan.hasNextInt()) {  	
			// User did not enter an integer. Re prompt user
			System.out.printf("%nEnter an integer between %d and %d: ", 1, 1000000);
			scan.next(); 			
		}
					
		// Store user input for year 
		int year = scan.nextInt();
					
		// Validate user input to make sure it is an integer from 1 to 1000000
		while ((year < 1) || (year > 1000000)) {
			// User did not enter an integer from 1 to 1000000. Re prompt 
			System.out.printf("%nEnter an integer between %d and %d: ", 1, 1000000);
			year = scan.nextInt(); 
		}	
		
		// Close Scanner object
		scan.close();
		
		// Create and instantiate a new MonthDays object with user input
		MonthDays driver = new MonthDays(month, year);
		
		// Calculate and store the days in the month specified by the user 
		int numberOfDays = driver.getNumberOfDays();
		
		// Display results
		System.out.printf("%d/%d has %d days.", month, year, numberOfDays);

	} // End of main method

} // End of MonthDayDriver class
