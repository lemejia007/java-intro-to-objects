
// Assignment05.java
// This program asks the user to specify a number of values they wish to enter. 
// The program will then prompt the user to enter values until the number of
// specified values have been entered. The program will then continue to 
// calculate and output results for a minimum value, maximum value, an average 
// value, standard deviation value for population, and a standard deviation 
// value for sample.


// Import declarations
import java.util.Scanner; // This program utilizes the Scanner class 

public class Assignment05 {
	
	// Method declarations
	
	/*
	 *  Method name: findMax();
	 *  Description: Method findMax() takes an array of doubles, steps through it, 
	 *               then calculates and returns a maximum value.
	 */
	public static double findMax(double[] userInput) {
		
		// Initialize maximum value
		double maxValue = userInput[0];
		
		for (int i = 1; i < userInput.length; i++) {	
			// Step through the array and find a maximum value
			if (userInput[i] > maxValue) {
				maxValue = userInput[i];
			}
		}		
		// Return maximum value
		return maxValue;
	}
	
	/*
	 *  Method name: findMin();
	 *  Description: Method findMin() takes an array of doubles, steps through it, 
	 *               then calculates and returns a minimum value.
	 */
	public static double findMin(double[] userInput) {
		
		// Initialize minimum value
		double minValue = userInput[0]; 
		
		for (int i = 1; i < userInput.length; i++) {
			// Step through the array and find a minimum value
			if (userInput[i] < minValue) {
				minValue = userInput[i];
			}
		}	
		// Return minimum value
		return minValue;
	}
	
	/*
	 *  Method name: findAverage();
	 *  Description: Method findAverage() takes an array of doubles, steps through 
	 *               it, then calculates and returns an average of all the values.
	 */
	public static double findAverage(double[] userInput) {
		
		// Declare and initialize a variable to hold the sum
		double sum = 0;
		
		// Calculate the sum of all the values
		for (double value: userInput) {
			// Add each value in the array to sum
			sum += value;
		}
		// Return average
		return (sum / userInput.length);
	}
	
	/*
	 *  Method name: findPopulationSD();
	 *  Description: Method findPopulationSD() takes an array of doubles and a 
	 *               double value representing average/mean, steps through the 
	 *               array of doubles, then calculates and returns the population 
	 *               standard deviation.
	 */
	public static double findPopulationSD(double[] userInput, double average) {
		
		// Declare and initialize sum of distances
		double sumOfDistances = 0.0;
		// Sum distances
		for (double value: userInput) {
			sumOfDistances += Math.pow((value - average), 2);
		}
		// Return population standard deviation
		return Math.sqrt(sumOfDistances/userInput.length);
	}
	
	/*
	 *  Method name: findSampleSD();
	 *  Description: Method sampleSD() takes an array of doubles and a double 
	 *               value representing average/mean, steps through the array of 
	 *               doubles, then calculates and returns the sample standard 
	 *               deviation.
	 */
	public static double findSampleSD(double[] userInput, double average) {
		
		// Declare and initialize sum of distances
		double sumOfDistances = 0.0;
		// Sum distances
		for (double value: userInput) {
			sumOfDistances += Math.pow((value - average), 2);
		}
		// Return sample standard deviation
		return Math.sqrt(sumOfDistances/(userInput.length - 1));
	}

	// Main method
	public static void main(String[] args) {
		
		// Create a Scanner object to use to collect user input
		Scanner scan = new Scanner(System.in);
		
		// Ask the user how many values they want to store in an array of doubles
		System.out.print("\nHow many values would you like to store in an array "
				             + "of doubles? ");
		
		// Validate user input to make sure user input is an integer greater than 1
		while (!scan.hasNextInt()) { 	
			// User did not enter an integer greater than one. Re prompt user
			System.out.print("\nEnter an integer greater than 1: ");
			scan.next(); 			
		}
			
		// Store user input for number of values wanting to store
		int numValues = scan.nextInt();
		
		// Create an array of doubles to hold the number of values given by the user
		double[] values = new double[numValues]; 
		
		// Prompt the user for a double value and store it in the array until all of 
		// the values have been read
		for (int i = 0; i < numValues; i++) {
			// Prompt the user for each value
			System.out.printf("Enter a double value for value number %d: ", (1 + i));
		  // Validate user input 
			while (!scan.hasNextDouble()) {  	
				// User did not enter a double. Re prompt user
				System.out.printf("Enter a double value for value number %d: ", (1 + i));
				scan.next(); 			
			}
			// Add values to values array
			values[i] = scan.nextDouble();
		}
		
		// Find the minimum and maximum values stored in the array 
		double minValue     = findMin(values);
		double maxValue     = findMax(values);      
		
		// Find the average of all of the values stored in the array
		double average      = findAverage(values); 
		
		// Compute the population standard deviation
		double populationSD = findPopulationSD(values, average);
		
		// Compute the sample standard deviation
		double sampleSD     = findSampleSD(values, average);
		
		// Output the results
		System.out.println("\n\nThe statistics for your user entered array are: \n" 
				               + "------------------------------------------------\n\n");
		System.out.printf("%32s      %-10.3f%n" + 
				              "%32s      %-10.3f%n" + 
				              "%32s      %-10.3f%n" +
				              "%32s      %-10.3f%n" +
				              "%32s      %-10.3f%n"             , 
				              "Minimum:"                        , minValue,
				              "Maximum:"                        , maxValue,
				              "Average:"                        , average,
				              "Standard deviation (population):", populationSD,
				              "Standard deviation (sample):"    , sampleSD);

	} // End of main method

} // End of class Assignment05
