public class Roster
{
    private Student[] studentsArray = new Student[3];
    public Roster()
    {
        Student freshman1 = new Student("Daniel", "Meshmik", 9, 13, 3, 3, 3, 2.5);
        Student senior1 = new Student("Daniel", "Meshnick", 12, 18, 4, 4, 4, 1);
        Student unknown = new Student();
        studentsArray[0] = freshman1;
        studentsArray[1] = senior1;
        studentsArray[2] = unknown;
    }
    public String findStudentWithMaxGPA()
    {
        double student1 = studentsArray[0].calcGPA();
        double student2 = studentsArray[1].calcGPA();
        double student3 = studentsArray[2].calcGPA();
        int highest = 0;
        
        if(student1 < student2)
        {
            highest = 1;
            if(student2 < student3)
            {
                highest = 2;
            }
        }
        else if(student1 < student3)
        {
            highest = 2;
        }
        return studentsArray[highest].studentName();
    }
    public String toString()
    {
        String output = "";
        for(Student element : studentsArray)
        {
            output += element +"\n";
        }
        return output;
    }
}