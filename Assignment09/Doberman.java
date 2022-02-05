
// Doberman.java
// This is a simple Doberman class to help make Doberman objects

// Class Doberman begin
public final class Doberman extends Dog {
	
	// Data declaration
	private boolean earsCropped;
	private boolean tailCropped;
	
	// Constructor declaration
	public Doberman(String breed, String name, String color, int sex, 
			            boolean earsCropped, boolean tailCropped) {
		super(breed, name, color, sex);
		this.earsCropped = earsCropped;
		this.tailCropped = tailCropped; 
	}
	
	// Method declarations
	public boolean areEarsCropped() { // Method to retrieve earsCropped
		return earsCropped;
	}
	
	public boolean isTailCropped() { // Method to retrieve tailCropped
		return tailCropped;
	}
	
	@Override
	public void makeSound() {
		System.out.println("\"Wroof!\" \"Wroof!\"");
	}

	@Override
	public void wagTail() {
		System.out.println("*Doberman wags its tail*");
	}

	@Override
	public void fetch() {
		System.out.println("*Doberman proceeds to fetch*");
	}
	
	@Override
	public void play() {
		this.wagTail();
		this.makeSound();
		this.fetch();
	}
	
	@Override
	public String toString() {
		return String.format("%s %n%s: %s %n%s: %s%n", super.toString(), 
				"Cropped Ears", areEarsCropped(), "Cropped Tail", isTailCropped());
	}
	
} // End of class Doberman
