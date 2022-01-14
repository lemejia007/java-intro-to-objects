
// Assignment02.java
// This program prompts the user to enter four integer values and displays the 
// four values in the order that they were entered along with the minimum and 
// maximum values entered.

// Import declaration
import java.util.Scanner; // This class makes use of the Scanner class

public class Assignment02 {
	
	// Constants
	private static final int SIZE = 4; // Number of values to be read
	
	// Function declarations
	
	/*
	 *  Function name: findMax();
	 *  Description:   Function findMax() takes an array and steps through it to 
	 *  							 find a maximum value.
	 */
	public static int findMax(int[] userInput) {
		
		// Initialize maximum value
		int maxValue = userInput[0];
		
		for (int i = 1; i < userInput.length; i++) {
			
			// Step through the array and find a maximum value
			if (userInput[i] > maxValue) {
				maxValue = userInput[i];
			}
		}
		
		// Return maxValue
		return maxValue;
	}
	
	/*
	 *  Function name: findMin();
	 *  Description:   Function findMin() takes an array and steps through it to 
	 *  							 find a minimum value.
	 */
	public static int findMin(int[] userInput) {
		
		// Initialize maximum value
		int minValue = userInput[0];
		
		for (int i = 1; i < userInput.length; i++) {
			
			// Step through the array and find a maximum value
			if (userInput[i] < minValue) {
				minValue = userInput[i];
			}
		}
		
		// Return maxValue
		return minValue;
	}

	// Main method
	public static void main(String[] args) {
		
		// Create a new Scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		// Create a new Array object to store user input
		int[] userInput = new int[SIZE]; 
		
		// Variable declarations
		int max,         // Holds maximum value
		    min;         // Holds minimum value
		int counter = 1; // Counter variable
		
		// Loop through userInput Array
		while (counter <= userInput.length) { 
				
			// Prompt the user for "counter" amount of values and store each value
			System.out.println("Enter an integer for value " + counter + " ");
			  
			// Validate user input and make sure an integer is entered
			while (!scan.hasNextInt()) {
			  	
			  // Notify the user that they did not enter an integer and re prompt
			  System.out.println("That is not a valid entry, please enter an integer");
			  scan.next();
			}
			
			// If user input is in fact an integer, store value
			userInput[counter - 1] = scan.nextInt();
			
			// Increment counter by 1
			counter++;
				
	  } 

		// Close the Scanner object
		scan.close();
			
		// Find the maximum value inside of userInput Array
		max = findMax(userInput);
		
	  // Find the minimum value inside of userInput Array
		min = findMin(userInput);
		
		// Display each value entered in the order they were entered and display 
		// the maximum and minimum values
		System.out.print("\nThe values entered: ");
		for (int i = 0; i < userInput.length; i++) {
			System.out.print(userInput[i] + ", ");
		}
		System.out.println("have a minimum value of " + min + 
				               " and a maxiumum value of " + max + ".");
		
	}

}

