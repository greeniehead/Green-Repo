public class Student
{
    private String firstName; 
    private String lastName;
    private int gradeLevel;
    private int age;
    //Added grades
    private double[] classGrades;
   
    public Student()
    {
        firstName = "John";
        lastName = "Doe";
        gradeLevel = 0;
        age = 0; 
        classGrades = new double[4];
    } // end zero argument constructor Student
      
    public Student( String firstName, String lastName, int gradeLevel, int age,
                  double gradeEnglish, double gradeMath, 
                  double gradeScience, double gradeHistory)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.age = age;
        //Put grades in the classGrades array
        this.classGrades = new double[4];
        this.classGrades[0] = gradeEnglish;
        this.classGrades[1] = gradeMath;
        this.classGrades[2] = gradeScience;
        this.classGrades[3] = gradeHistory;
      
    } // end eight argument constructor Student
   
      
    //Add method to calculate GPA.
    private double calcGPA()
    {
        double gpa = 0.0;
        double total = 0.0;
       
        for(int i = 0; i < classGrades.length; i++)
        {
            total += classGrades[i];
        }
       
        gpa = total / classGrades.length;
       
        return gpa;
    }
   
    public void setGrades(double newGradeEnglish, double newGradeMath, double newGradeScience, 
                        double newGradeHistory)
    {
        this.classGrades[0] = newGradeEnglish;
        this.classGrades[1] = newGradeMath;
        this.classGrades[2] = newGradeScience;
        this.classGrades[3] = newGradeHistory;
    }
    
    public String getGrade()
    {
        if(calcGPA() >= 4)
        {
            return "A";
        }
        else if(calcGPA() >= 3)
        {
            return "B";
        }
        else if(calcGPA() >= 2)
        {
            return "C";
        }
        else if(calcGPA() >= 1)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
      
    public String toString()
    {
        String studentInfo = new String();
        studentInfo = ( "First Name:" + firstName + "\n" +
                      "Last Name: " + lastName + "\n" +
                      "Grade level: " + gradeLevel + "\n" +
                      "Age: " + age  + "\n" +
                      "Average GPA: " + calcGPA() + "\n" +
                      firstName + "'s Grade is: " + getGrade() + "\n" + 
                      classGrades[0] + " " + classGrades[1] + " " + classGrades[2] +
                      " " + classGrades[3] + "\n");
                      
                      //Add code to calc and display GPA
                      
        return studentInfo;
                      
    } // end method toString
       
   } // end class student