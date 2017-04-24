
/**
 * Write a description of class RegularMyPhone here.
 * 
 * @author KAT 
 * @version 12Apr17
 */
public class RegularMyPhone
{
   private int memory;
   private String color;
   private String carrier;    // cell phone service provider
   
   public RegularMyPhone()
      {
      this.memory = 8;   // in GB
      this.color = new String( "Black" );   
      this.carrier = new String( "none" );
      } // end zero argument constructor
      
   public RegularMyPhone( int memory, String color, String carrier )
      {         
      this.memory = memory;   // in GB
      this.color = color; 
      this.carrier = carrier; // service provider
      } // end three argument constructor
      
   public String toString()
      {
      String output = new String();
      output = "Memory capacity is: " + memory + "GB\n" + 
               "Color is: " + color + "\n" +
               "Carrier is: " + carrier;
      return output;
      } // end method toString()
}
