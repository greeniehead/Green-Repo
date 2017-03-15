import java.util.Scanner;

public class WhileForLoop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        for( int count = 0; count < 3; count++)
        {
            System.out.println("Please enter an odd number: ");
            int x = keyboard.nextInt();
            
            while( x % 2 != 1 )
            {
                System.out.println("Try Again: ");
                x = keyboard.nextInt();
            }
            System.out.println("Thank you");
        }
        System.out.println("That's all!");
    }
}