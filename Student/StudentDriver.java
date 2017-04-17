
public class StudentDriver
   {
   public static void main( String args[] )
      {
      Student senior001 = new Student();
      System.out.println( senior001 );
      
      Student frosh001 =  new Student( "Danny", "Meshmick", 9, 14, 4.0, 3.5, 3.5, 3.0 );
      System.out.println(frosh001);
      
      frosh001.setGrades(4.0, 4.0, 3.5, 3.0);
      System.out.println(frosh001);
      } // end method main
   } // end class ClockDriver