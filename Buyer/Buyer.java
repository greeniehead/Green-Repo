
/**
 * Buyer class defines a 
 * 
 * @author KAT 
 * @version 16Mar17
 */
public class Buyer
{
    // instance variables - replace the example below with your own
    private String name;
    private String state;
    private double salesTaxRate;
    private int mostRecentBuyMonth;

    /**
     * Constructor for objects of class Buyer
     * zero-arg constructor
     */
    public Buyer()
    {
        // initialise instance variables
        name = "John Doe";
        state = "unknown";
        salesTaxRate = 0.0;
        mostRecentBuyMonth = 1;    //1=Jan, 12=Dec
    }

    /**
     * Constructor for objects of class Buyer
     * four-arg constructor
     */
    public Buyer(String name, String state, double salesTaxRate, int mostRecentBuyMonth)
    {
        // initialise instance variables
        this.name = name;
        this.state = state;
        this.salesTaxRate = salesTaxRate;
        this.mostRecentBuyMonth = mostRecentBuyMonth;    //1=Jan, 12=Dec
    }    
    
    /**
     * get salesTaxRate
     */
    public double getSalesTaxRate()
    {
        return salesTaxRate;
    }
    
    /**
     * set salesTaxRate
     * 
     * Check to see if 0 < argument <= MAX_TAX_RATE.
     * If it is, update.   If not, print a Warning and leave it unchanged.
     */
    public void setSalesTaxRate(double salesTaxRate)
    {
        final double MAX_TAX_RATE = 0.15;   //This is the maxiumum tax rate
        
        if ( (salesTaxRate > 0.0) && (salesTaxRate <= MAX_TAX_RATE) )
        {
            this.salesTaxRate = salesTaxRate;
        } else {
            System.out.println("WARNING: Bad tax rate " + salesTaxRate +
                           ".  Leaving salesTaxRate unchanged at " + this.salesTaxRate);
        }
    } //end method setSalesTaxRate
    
    /**
     * get name
     * 
     * Get name, but only print the first three characters, then
     * mask with asterisks
     */
    public String getName()
    {
        String maskName = "";
        
        for( int i = 0; i < name.length(); i++) {
            if (i < 3) {
                maskName += name.charAt(i);
            } else {
                maskName += "*";
            }
        }
        
        return maskName;
    } //end method getName()
    
    /**
     * set name
     * 
     * limit name to 50 characters.
     */
    public void setName( String name )
    {
        if( name.length() < 50) {
            this.name = name;
        } else {
            System.out.println("WARNING: Name is too long.  Unchanged.");
        }
    } //end method setName()
    
    public String getState()
    {
        return this.state;
    }
    
    public void setState(String newState)
    {
        boolean temp = false;
        String[] statesList = {"WA", "OR", "CA", "NV", "AZ"};
        for(String element : statesList)
        {
            if(newState == element)
            {
                temp = true;
            }
        }
        if(temp)
        {
            this.state = newState;
        }
    }
} //end class Buy
