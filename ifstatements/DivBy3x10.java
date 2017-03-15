import java.util.Scanner;

public class DivBy3x10
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        for( int x = 0; x < 10; x++ )
        {
            System.out.println("Please enter an integer to determine if it is divisible by 3: ");
            int num = keyboard.nextInt();
            
            if( num % 3 == 0)
            {
                System.out.println("The number, " + num + ", is divisible by 3.");
            }
            else
            {
                System.out.println("The number, " + num + ", is not divisible by 3.");
            }
        }
    }
}