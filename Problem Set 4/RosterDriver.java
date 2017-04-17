public class RosterDriver
{
    public static void main(String[] args)
    {
        Roster rooster = new Roster();
        System.out.println(rooster);
        System.out.println("The student with the highest GPA is: " + rooster.findStudentWithMaxGPA());
    }
}