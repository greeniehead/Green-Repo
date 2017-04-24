
/**
 * Write a description of class RegularMyPod here.
 * 
 * @author KAT 
 * @version 12Apr17
 */
public class RegularMyPod
{
   private int memory;
   private String color;
   
   public RegularMyPod()
      {
      this.memory = 8;   // in GB
      this.color = new String( "Black" );   
      } // end zero argument constructor
      
   public RegularMyPod( int memory, String color )
      {
      this.memory = memory;   // in GB
      this.color = color;   
      } // end two argument constructor
      
   public String toString()
      {
      String output = new String();
      output = "Memory capacity is: " + memory + "GB\n" + 
               "Color is: " + color;
      return output;
      } // end method toString()
      
}
