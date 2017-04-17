
public class StudentDriver
   {
   public static void main( String args[] )
      {
      Student senior = new Student("Joe", "Senior", 12, 18, 2.0, 4.0, 3.5, 4.0);
      senior.setGrades(4.0, 4.0, 4.0, 4.0);
      System.out.println(senior);
      
      Student freshman = new Student("Danny", "Meshmick", 9, 14, 3.0, 4.0, 3.5, 4.0);
      freshman.setGrades(4.0, 4.0, 4.0, 4.0);
      System.out.println(freshman);
      } // end method main
   } // end class ClockDriver