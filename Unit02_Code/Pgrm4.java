import java.util.Scanner; //get scanner

public class Pgrm4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); //initialize scanner
        
        System.out.println("Enter an number: "); //asking for number 1
        double one = keyboard.nextDouble(); //creating variable
        
        System.out.println("Enter an number: "); //asking for number 2
        double two = keyboard.nextDouble(); //creating variable
        
        System.out.println("Enter an number: "); //asking for number 3
        double three = keyboard.nextDouble(); //creating variable
        
        System.out.println("Enter an number: "); //asking for number 4
        double four = keyboard.nextDouble(); //creating variable
        
        System.out.println("Enter an number: "); //asking for number 5
        double five = keyboard.nextDouble(); //creating variable
        
        double total = one + two + three + four + five; //calculating total
        
        double avg = total / 5; //calculating average
        
        System.out.println("The average is: " + avg); //printing average
        /*
        System.out.println("test"); //test 1
        System.out.print("test2"); //test 2
        System.out.println("test3"); //test 3 it then prints this on the same line as test 2
        */
    }
}