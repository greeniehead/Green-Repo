/**
 * MyDevice as a superclass
 * 
 * @author KAT
 * @version 12Apr17
 */

public class MyDevice
{
   //1. Instance variables
   //All devices have these!
   private int memory;
   private String color;
   
   //2. Constructors
   // Zero element constructor
   public MyDevice()
   {
      this.memory = 8; // in GB
      this.color = new String( "Black" );
    }

   // Two arg constructor
   public MyDevice( int memory, String color )
   {
       this.memory = memory;   // in GB
       this.color = color;   
   } // end two argument constructor
   
   //3. toString   
   public String toString()
   {
      String output = new String();
      output = "Memory capacity is: " + memory + "GB\n" + 
               "Color is: " + color;
      return output;
   } // end method toString()

} // end class MyDevice