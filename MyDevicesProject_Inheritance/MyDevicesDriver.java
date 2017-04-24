import java.util.ArrayList;

public class MyDevicesDriver
   {
   public static void main( String[] args )
      {
      MyDevice someDevice = new MyDevice();
      MyPhone phone1 = new MyPhone();
      MyPhone phone2 = new MyPhone();
      MyPod pod1 = new MyPod();
      MyPod pod2 = new MyPod();
      MyComputer comp1 = new MyComputer();
      MyComputer comp2 = new MyComputer(1000, "green", 16, "AMD");
      
      System.out.println( "Now with Inheritance" );
      System.out.println( "Polymorphically! traversing the ArrayList of MyDevices..." );
      ArrayList<MyDevice> inventory = new ArrayList<MyDevice>();
      inventory.add( phone1 );
      inventory.add( phone2 );
      inventory.add( pod1 );
      inventory.add( pod2 );
      inventory.add(comp1);
      inventory.add(comp2);
      
      for( MyDevice device : inventory )
         {
         System.out.println( device );  
            
         } // end for each
         
      System.out.println( "\n\n\nSteps to implementing Inheritance..." );
      System.out.println( "Step 1 - Factor out common instance variables and methods into a superclass" );
      System.out.println( "Step 2 - use keyword \"extend\" to link it to the superclass" );
      System.out.println( "Step 3 - use super() to call the superclass's constructor (zero or multi)" );
      System.out.println( "Step 4 - use super.methodCall() to call methods in the superclass" );
      System.out.println( "Step 5 - create arrays or ArrayLists of superclass object to " + 
                           " polymorphically process all \"seemingly different\" objects" );
      
      } // end method main
      
   } // end class MyDevicesDriver
   