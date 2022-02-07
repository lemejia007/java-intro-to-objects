
// MonthDayDriver.java
// This class is a driver class for class MonthDay. The program will prompt the 
// user for a month and a year first before evaluating and outputting the number 
// of days in the user specified month. (This is an updated version to demonstrate
// Java's exception handling mechanism.)

// Import declarations
import java.util.Scanner; // This class uses a Scanner object to collect input

// Class MonthDayDriver
public class MonthDaysDriver2 {

	// Main method
	public static void main(String[] args) {
		
		// Create a new Scanner object to obtain input from the user
		Scanner scan = new Scanner(System.in);
		
		boolean continueLoop = true; // determines if more input is needed
		
		do {
			try {
				// Prompt user for the month
				System.out.print("\nEnter an integer number from 1 to 12 for the month \n" + 
				                   "(1=January, 2=February, ..., 12=December): ");
						
				// Store user input for month 
				int month = scan.nextInt();	
				
				// Prompt user for the year
				System.out.print("\nEnter a year starting from year 1 up to year 1000000: ");
							
				// Store user input for year 
				int year = scan.nextInt();
				
			  // Create and instantiate a new MonthDays object with user input
				MonthDays2 driver = new MonthDays2(month, year);
				
				// Calculate and store the days in the month specified by the user 
				int numberOfDays = driver.getNumberOfDays();
				
				// Display results
				System.out.printf("%d/%d has %d days.", month, year, numberOfDays);

				continueLoop = false; // input successful; end looping
			}
			catch (IllegalArgumentException e) {
				System.out.printf("%nException: %s%n", e);
				scan.nextLine(); // discard input so user can try again
				System.out.println("Invalid input, try again.");
			}

		} while (continueLoop);
		
	  // Close Scanner object
		scan.close();
		
	} // End of main method

} // End of MonthDayDriver class
