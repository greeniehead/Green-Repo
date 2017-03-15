import java.util.Scanner;

public class P2CStudentDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        Student senior001 = new Student();
        System.out.println(senior001);
        
        System.out.println("Please enter the first and last name of the student.");
        Student frosh001 = new Student(keyboard.next(), keyboard.next());
        System.out.println(frosh001);
    }
}