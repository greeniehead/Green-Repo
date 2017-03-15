public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    public Student()
    {
        firstName = "Someone";
        lastName = "Someone's last name";
        gradeLevel = 12;
        gpa = 4.20;
    }
    
    public Student(String newFirstName, String newLastName)
    {
        firstName = newFirstName;
        lastName = newLastName;
        gradeLevel = 9;
        gpa = 4.00;
    }
    
    public String toString()
    {
        String output = new String();
        output = "name: " + firstName + " " + lastName + "\n" +
                 "grade level: " + gradeLevel + "\n" +
                 "gpa: " + gpa;
                 
        return output;
    }
}
