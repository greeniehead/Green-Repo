import java.util.Scanner;

public class UpperToLowerCase
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        while( 1 == 1 )
        {
            System.out.println("Please enter an uppercase letter: ");
            String input = keyboard.next();
            char upper = input.charAt(0);
        
            if((int)upper < 65)
            {
                System.out.println("Sorry, was not a letter.");
                System.out.println("");
            }
            else if((int)upper > 90)
            {
                System.out.println("Sorry, that character was not uppercase.");
                System.out.println("");
            }
            else
            {
                int lower = (int)upper + 32;
                System.out.println("Uppercase: " + upper + "   Lowercase: " + (char)lower);
                System.out.println("");
            }
        }
    }
}