
// Parrot.java
// Class Parrot helps create Parrot objects

// Class Parrot begin
public class Parrot {
	
	// Data implementation
	private static final String  classification = "Avian";
	private static final String  species        = "Parrot";
	private              String  color;
	private              String  name;
	private              int     sex;
	private              boolean canSpeak; 
	
  // Four argument constructor
	public Parrot(String color, String name, int sex, boolean canSpeak) {
		this.color    = color;
		this.name     = name;
		this.sex      = sex;
		this.canSpeak = canSpeak;
	}
	
	public String getClassification() { // Method to retrieve classification
		return classification;
	}
	
	public String getSpecies() { // Method to retrieve species
		return species;
	}
	
	public String getColor() { // Method to retrieve color
		return color;
	}
	
	public String getName() { // Method to retrieve name
		return name;
	}
	
	public void setName(String name) { // Method to set name
		this.name = name;
	}
	
	public String getSex() { // Method to retrieve sex
		String s = null;
		
		if (sex == 0) {
			s = "Female";
		} 
		else if (sex == 1) {
			s = "male";
		}
		return s;
	}
	
	public boolean canSpeak() { // Can the Parrot object talk?
		return canSpeak; 
	}
	
} // End of Class Parrot
