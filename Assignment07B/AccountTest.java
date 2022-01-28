
// Fig. 7.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
// *** Updated to store the balance as a BigDecimal object and to perform all 
// calculations/operations as BigDecimal. ***

import java.math.BigDecimal; // Class AccountTest makes use of class BigDecimal
import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", BigDecimal.valueOf(50.00));
      Account account2 = new Account("John Blue", BigDecimal.valueOf(7.53).negate()); 

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      BigDecimal placedAmount1 = BigDecimal.valueOf(depositAmount); // convert
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         placedAmount1);
      account1.deposit(placedAmount1); // add to account1's balance

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      BigDecimal placedAmount2 = BigDecimal.valueOf(depositAmount); // convert
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         placedAmount2);
      account2.deposit(placedAmount2); // add to account2 balance

      // display balances
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 
   } // end main
} // end class AccountTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
