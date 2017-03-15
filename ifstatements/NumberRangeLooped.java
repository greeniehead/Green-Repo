import java.util.Scanner;

public class NumberRangeLooped
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        while( 1 == 1 )
        {
            System.out.println("Please enter an integer: ");
            int x = keyboard.nextInt();
        
            if( x < 0 )
            {
                System.out.println("The number you put in was negative.");
            }
            else if( x <= 9 )
            {
                System.out.println("The number you put in was between 0 and 9.");
            }
            else if( x <= 19 )
            {
                System.out.println("The number you put in was between 10 and 19.");
            }
            else if( x <= 29 )
            {
                System.out.println("The number you put in was between 20 and 29.");
            }
            else if( x <= 39 )
            {
                System.out.println("The number you put in was between 30 and 39.");
            }
            else
            {
                System.out.println("The number you put in was greater than 40.");
            }
        }
    }
}