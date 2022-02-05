
// Dog.java
// This is a simple Dog abstract class

// Class Dog begin
public abstract class Dog implements Playable {

	// Data declaration
	private String breed;
	private String name;
	private String color;
	private int    sex;
	
	// Constructor declaration
	public Dog(String breed, String name, String color, int sex) {
		this.breed = breed;
		this.name  = name;
		this.color = color;
		if (sex < 0 || sex > 1) { // Simple validation
			throw new IllegalArgumentException("sex has to be < 0 OR > 1");
		}
		this.sex   = sex;
	}
	
	// Method declarations
	public String getBreed() { // Method to retrieve breed
		return breed;
	}
	
	public String getName() { // Method to retrieve name
		return name;
	}
	
	public void setName(String name) { // Method to set name
		this.name = name;
	}
	
	public String getColor() { // Method to retrieve color
		return color;
	}
	
	public String getSex() { // Method to retrieve sex
		String s = null;
		if (sex == 0) {
			s = "female";
		} else if (sex == 1) {
			s = "male";
		}
		return s;
	}
	
	@Override
	public String toString() {
		return String.format("%n%s: %s %n%s: %s %n%s: %s %n%s: %s ", "Breed", 
		 getBreed(), "Name", getName(), "Color", getColor(), "Sex", getSex());
	}
	
	public abstract void wagTail(); 
	
	public abstract void fetch();
	
} // End of class Dog
