
// Assignment04.java
// This program prompts the user to enter a value/number no smaller than MIN 
// (in this case 2) and no greater than MAX (in this case 100000). Then displays 
// all perfect numbers from MIN to a user defined value called maxInteger. 

// Import declarations
import java.util.Scanner; // The Scanner class is used to collect user input

public class Assignment04 {
	
  //Constants
	private static final int MIN = 2;      // Minimum number accepted
	private static final int MAX = 100000; // Maximum number accepted 
	
	// Method declarations
	
	/*
	 *  Method name: isPerfect();
	 *  Description: Method isPerfect() accepts a single integer value and returns 
	 *  						 a String containing the factors for the value that total up 
	 *               to the value if the value is a perfect number. If the value 
	 *               is not a perfect number, method isPerfect() returns a null 
	 *               String. 
	 */
	
	public static String isPerfect(int number) {
		
		String factors = "Factors: "; // String to be returned
		int    sum     = 0;           // Sum of values 
		
		// Loop to figure out if number is a perfect number
		for (int i = 1; i < number; i++) {
			// If "i" is a factor of number
			if(number % i == 0) {
				// Add i to sum 
				sum += i;
				// Add i to the list of factors
				factors = factors + i + " ";
			}
		}
		
		// If sum is equal to number, number is a perfect number
		if (sum == number) { 
			// Return list of factors as a string
			return factors;
		} 
		else {
			// Return null
			return null;
		}
		
	}
	
	// Main Method
	public static void main(String[] args) {
		
		// Create a Scanner object to collect user input
		Scanner scan = new Scanner(System.in); 
		
		// Prompt user for an integer between 2 and 100000
		System.out.printf("%n%s%n%s%d and %d: ", "To test for perfect numbers, ", 
				                                   "enter an intger between ", MIN, MAX);
		
	  // Validate user input to make sure input is an integer between MIN and MAX
		while (!scan.hasNextInt()) {  	
			// User did not enter an integer. Re prompt user
			System.out.printf("%nEnter an integer between %d and %d%n", MIN, MAX);
			scan.next(); 			
		}
			
		// Store user input for maximum value 
		int maxInteger = scan.nextInt();
			
		// Validate user input to make sure input is an integer between MIN and 
		// maxInteger
		while ((maxInteger < MIN) || (maxInteger > maxInteger)) {
		  // User did not enter an integer between MIN and maxInteger. Re prompt 
			System.out.printf("%nEnter an integer between %d and %d%n", MIN, MAX);
			maxInteger = scan.nextInt(); 
		} 
		
		// Close Scanner object
		scan.close();
		
	  // Process and display all perfect numbers and their factors 
		for (int i = 1; i <= maxInteger; i++) {
			// If i is a perfect number
			if (isPerfect(i) != null) {
				// Notify user that i is a perfect number and display i's factors
				System.out.printf("%n%d is a perfect number.%n     %s", i, isPerfect(i));
			}			
		}
		
		// If maxInteger is less than 6, notify user of not perfect numbers
		if (maxInteger < 6) {
			System.out.println("There are no perfect numbers from " 
		                     + MIN + " and " + maxInteger);
		}
	
	}

} // End of program.
