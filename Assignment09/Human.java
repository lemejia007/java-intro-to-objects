
// Human.java
// This is a simple Human class

// Start of class Human
public final class Human implements Playable {

	// Data declaration
	private String name;
	private int    sex;
	
	// Constructor declaration
	public Human(String name, int sex) {
		this.name = name;
		if (sex < 0 || sex > 1) { // Simple validation
			throw new IllegalArgumentException("sex has to be < 0 OR > 1");
		}
		this.sex  = sex;
	}
	
	// Method declarations
	public String getName() { // Method to retrieve name
		return name;
	}
	
	public void setName(String name) { // Method to set name
		this.name = name;
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
	
	public void throwBall() {
		System.out.println("*Human proceeds to throw ball*");
	}
	
	@Override
	public void makeSound() {
		System.out.println("\"Fetch!\"");
	}

	@Override
	public void play() {
		this.makeSound();
		this.throwBall();
	}
	
	@Override
	public String toString() {
		return String.format("%n%s: %s %n%s: %s ", "Name", getName(), "Sex", getSex());
	}

} // End of class Human
