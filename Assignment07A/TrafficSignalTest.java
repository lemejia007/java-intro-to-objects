
// TrafficSignalTest.java
// This program tests enum TrafficSignal by displaying each enum constant and 
// the duration of the enum constant

// Class TrafficSignalTest
public class TrafficSignalTest {

	// Main method
	public static void main(String[] args) {
		
	// Displays each enum constant and the duration of the enum constant
	for (TrafficSignal traffic : TrafficSignal.values())
		System.out.printf("%-10s : %s%n", traffic,
		traffic.getSeconds());

	} // End of main method

} // End of class TrafficSignalTest
