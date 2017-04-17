
/**
 * BuyDriver exercises the methods in the Buy class
 * 
 * @author KAT 
 * @version 16Mar17
 */
public class BuyDriver
{
    public static void main()
    {
        /* Check the Buy class.
         * Create a buyer.
         * get and print the name and salesTaxRate
         *     Make sure the name is masked.
         * Try to set the salesTaxRate to 8.  Expect an error message.
         * get and print salesTaxRate to see that it did NOT change.
         * Set salesTaxRate to .14.
         * get and print salesTaxRate to see that it did change.
         */
        
         // Create a buyer.
         Buyer tim = new Buyer("Tim The Enchanter", "CA", 0.08, 6); 
         
         // get and print the name and salesTaxRate
         System.out.println("Name: " + tim.getName() + 
                            "\nSales Tax Rate: " + tim.getSalesTaxRate() );
         
         // NOTE: Name should be masked!
         
         // Try to set the salesTaxRate to 8.  Expect an error message.
         tim.setSalesTaxRate(8);

         
         // get and print salesTaxRate to see that it did NOT change.
         System.out.println("Sales Tax Rate (expected the same after error): " + 
                            tim.getSalesTaxRate());
         
         // Set salesTaxRate to .14.
         tim.setSalesTaxRate(0.14);
         
         // get salesTaxRate to see that it did change.
         System.out.println("Sales Tax Rate (should have changed): " + tim.getSalesTaxRate());
         
         System.out.println("State: " + tim.getState());
         tim.setState("OR");
         System.out.println("State: " + tim.getState());
        } // end method main()
        
        
} //end class BuyDriver
