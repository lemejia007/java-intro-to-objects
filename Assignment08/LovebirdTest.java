
// LovebirdTest.java
// This is a driver class to test class Parrot and class Lovebird and is 
// intended to demonstrate inheritance. This program prompts the user for a 
// Lovebird's color, name, gender before creating a Lovebird object and printing 
// it.

// Import declaration
import java.util.Scanner;

// Class Lovebird begin
public class LovebirdTest {

	// Main method
	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Prompt the user for the color
		System.out.print("What is the lovebird's color? ");
		String color = scan.nextLine();
		
		// Prompt the user for the name
		System.out.print("What is the lovebird's name? ");
		String name = scan.nextLine();
		
		// Prompt the user for the gender
		System.out.print("What is the lovebird's gender?\n" + 
		                  "Enter 0 for female OR 1 for male: ");
		int gender = scan.nextInt();
		// Validate user input to make sure input is a 0 or 1
		while ((gender < 0) || (gender > 1)) {
		  // User did not enter a 0 or 1 
			System.out.printf("%nEnter an integer between %d and %d%n", 0, 1);
			gender = scan.nextInt(); 
		} 
		
		// Create a new Lovebird instance
		Lovebird birdy = new Lovebird(color, name, gender);
		
		// Print Lovebird object
		System.out.println(birdy);

	} // End of main method

} // End of class LovebirdTest
