
// LovebirdTest.java
// This is a driver class to test class Parrot and class Lovebird and is 
// intended to demonstrate inheritance. 

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
		System.out.print("What is the lovebird's sex?\n" + 
		                  "Enter 0 for female OR 1 for male: ");
		int sex = scan.nextInt();
		// Validate user input to make sure input is a 0 or 1
		while ((sex < 0) || (sex > 1)) {
		  // User did not enter a 0 or 1 
			System.out.printf("%nEnter an integer between %d and %d%n", 0, 1);
			sex = scan.nextInt(); 
		} 
		
		// Create a new Lovebird instance
		Lovebird birdy = new Lovebird(color, name, sex);
		
		// Print Lovebird object
		System.out.println(birdy);

	} // End of main method

} // End of class LovebirdTest
