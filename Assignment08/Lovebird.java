
// Lovebird.java
// Class Lovebird extends class Parrot and helps create Lovebird objects 

// Class Lovebird begin
public class Lovebird extends Parrot {

	// Data implementation
	private final String type = "Lovebird";
	
	// Three argument constructor
	public Lovebird(String color, String name, int sex) {
		
		super(color, name, sex, false); // Call super's constructor 
	}
	
	public String getType() { // Method to retrieve type
		return type;
	}
	
  // Override method canTalk()
	@Override 
	public boolean canSpeak() { 
		System.out.println("\nChirp chirp!");
		return super.canSpeak();
	}
	
	// Override Object's toString() method 
	@Override
	public String toString() {
		return String.format("%n%s: %s %n%s: %s %n%s: %s %n%s: %s %n%s: %s %n%s: %s %n%s: %b", 
				"Classification", getClassification(), "Species", getSpecies(), "Type", getType(), 
				"Color", getColor(), "Name", getName(), "Sex", getSex(), "Can it speak?", 
				canSpeak());
	}
	
} // End of class Lovebird
