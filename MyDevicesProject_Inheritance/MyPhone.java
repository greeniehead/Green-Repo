/**
 * MyPhone subclass of MyDevice
 * 
 * @author KAT
 * @version 12Apr17
 * 
 */

public class MyPhone extends MyDevice
{
    
   //1. Instance Variables
   private String carrier;    // cell phone service provider
   
   //2. Constructors
   // zero-arg constructor
   public MyPhone()
      {
      super();   // calls the constructor from the class
                 // above it "MyDevice"
      this.carrier = new String( "none" );
      } // end zero argument constructor
   
   // three-arg constructor
   public MyPhone( int memory, String color, String carrier )
      {         
      super( memory, color );
      this.carrier = carrier; // service provider
      } // end two argument constructor
   
   //3. toString()
   public String toString()
      {
      String output = new String( "" );
      output = "Phone: " + super.toString() + "\n" +
               "Carrier is: " + carrier;
      return output;
      } // end method toString()
} // end class MyPhone