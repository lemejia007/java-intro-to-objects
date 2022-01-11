
// Assignment01.java
// This program makes use of the GUI/ JOptionPane class and prompts the user for 
// input in order to help a small retail company file a monthly sales tax report 
// listing the sales for the month and the amount of sales tax collected.

// Import declarations
import javax.swing.JOptionPane; // Program uses the JOptionPane class

public class Assignment01 {
	
	// Constants
	private static final double STATE_TAX  = 0.0575; // State  tax
	private static final double COUNTY_TAX = 0.0285; // County tax
	
	public static void main(String[] args) {
		
		// Prompt The user for the name of the month
		String month          = 
			JOptionPane.showInputDialog("Enter the month name: ");
		
		// Prompt the user for the year
		int    year           = 
			Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));
		
		// Prompt the user for the total amount collected in sales(including taxes)
		double totalSales     = 
			Double.parseDouble(JOptionPane.showInputDialog("Enter total sales: "));
		
		// Calculate sales(excluding taxes)
		double sales          = totalSales / (1.00 + STATE_TAX + COUNTY_TAX);
		
		// Calculate total sales tax
		double totalTax       = totalSales - sales;
		
		// Calculate state sales tax
		double stateSalesTax  = sales      * STATE_TAX;
		
		// Calculate county sales tax
		double countySalesTax = sales      * COUNTY_TAX;
		
		// Display monthly sales tax report
		System.out.printf("%nMonth: %s %d %n", month              , year);
		System.out.printf("%-31s%n"          , "- - - - - - - - - - - - - - - - -");
		System.out.printf("%-21s$ %10.2f%n"  , "Total Collected:" , totalSales);
		System.out.printf("%-21s$ %10.2f%n"  , "Sales:"           , sales);
		System.out.printf("%-21s$ %10.2f%n"  , "County Sales Tax:", countySalesTax);
		System.out.printf("%-21s$ %10.2f%n"  , "State Sales Tax:" , stateSalesTax);
		System.out.printf("%-21s$ %10.2f%n"  , "Total Sales Tax:" , totalTax);
	
	}

}
