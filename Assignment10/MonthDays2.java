
// MonthDays.java
// This class can be used to create objects that can compute and return the 
// number of days in a month of a specific year. (This is an updated version to 
// demonstrate Java's exception handling mechanism.)

// Class MonthDays
public class MonthDays2 {

	/*****************************************************************************
	*                   Class member variable declarations
	*/
	
	private int month = 0; // Holds month
	private int year  = 0; // Holds year
		
	/*****************************************************************************
	*                   Constructor declarations
	*/
	
	// Two-argument constructor initializes month and year respectively
	public MonthDays2(int month, int year) {	
		setMonth(month); // Assign month to this object
		setYear (year);	 // Assign year to this object
	}
	
	/*****************************************************************************
	*                   Getter/Setter method declarations
	*/
	
	public void setMonth(int month) throws IllegalArgumentException { // Method to set month
		// Assign month only if value passed is between 1 and 12 inclusive
		if (month > 0 && month <= 12) {
			this.month = month;
		} else {
			throw new IllegalArgumentException(); 
		}
	}
	
	public void setYear(int year) throws IllegalArgumentException { // Method to set year
		// Assign year only if value passed is between 0 and 1000000
		if (year > 0 && year <= 1000000) {
			this.year = year;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getMonth() { // Method to retrieve month
		return month; 
	}
	
	public int getYear() { // Method to retrieve year
		return year; 
	}
	
  public int getNumberOfDays() {
  	
    // Create an array representing the days in each month of the year 
   	int[] daysPerMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  	
  	// If year is divisible by (100 AND 400) OR year is divisible by 4 then year 
  	// is a leap year
  	if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0)) { 
  		daysPerMonth[1] = 29; // Assign February 29 days 
  	}  
  	
  	// Declare and initialize numOfDays
  	int numOfDays = 0;
  	
  	// Find the number of days for the month the user specified
  	switch (month) {
    	case 1:  numOfDays = daysPerMonth[0];
               break;
    	case 2:  numOfDays = daysPerMonth[1];
               break;
    	case 3:  numOfDays = daysPerMonth[2];
               break;
    	case 4:  numOfDays = daysPerMonth[3];
               break;
    	case 5:  numOfDays = daysPerMonth[4];
               break;
    	case 6:  numOfDays = daysPerMonth[5];
               break;
    	case 7:  numOfDays = daysPerMonth[6];
               break;
    	case 8:  numOfDays = daysPerMonth[7];
               break;
    	case 9:  numOfDays = daysPerMonth[8];
               break;
    	case 10: numOfDays = daysPerMonth[9];
               break;
    	case 11: numOfDays = daysPerMonth[10];
               break;
    	case 12: numOfDays = daysPerMonth[11];
               break;
    }
  	
  	// Return the number of days
  	return numOfDays;
	}
	
} // End of class MonthDays
