/**
 * MyPod subclass
 * 
 * @author KAT
 * @version 12Apr17
 */

public class MyPod extends MyDevice
{
   //1. No Instance variables
       
   //2. Constructors
   // zero-arg constructor
   public MyPod()
   {
      super();   
   } // end zero argument constructor
   
   // Two-arg constructor
   public MyPod( int memory, String color )
   {
      super( memory, color );   // "pass the buck" to the superclass MyDevice   
   } // end two argument constructor
   
   
   //3. toString()
   public String toString()
   {
      return ("Pod: " + super.toString());   // call the toString() method from MyDevice...
                                             // no need to rewrite it again!
   } // end method toString()
      
} // end class MyPad