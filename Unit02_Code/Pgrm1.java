import java.util.Scanner;

public class Pgrm1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); //initialize scanner
        
        System.out.println("Enter an integer: "); //ask for integer
        int x = keyboard.nextInt(); //creates variable
        
        System.out.println("Enter an integer: "); //ask for integer
        int y = keyboard.nextInt(); //creates variable
        
        int z = x * y; //does the multiplication
        
        System.out.println(x + " multiplied by " + y + " is " + z); //prints it out
    }
}