
// PolymorphismTest.Java
// This is a driver class and is meant to demonstrate polymorphism through the 
// use of interface Playable, abstract class Dog, and concrete classes Human and 
// Doberman

// Start of driver class DobermanTest
public class PolymorphismTest {

	// Main method
	public static void main(String[] args) {
		
		// Create a Human object
		Playable luis = new Human("Luis", 1);
		
		// Create a Doberman object
		Playable scarlett = new Doberman("Doberman", "Scarlett", "Brown", 0, false, true);
		
		// Print both objects polymorphically
		System.out.println("\nPrinting both objects polymorphically:");
		System.out.println(luis.toString());
		System.out.println(scarlett.toString());
		
		// Have both objects play pollymorphically
		System.out.println("Have both objects interact polymorphically:\n");
		luis.play();
		scarlett.play();

	} // End of main method

} // End of driver class DobermanTest
