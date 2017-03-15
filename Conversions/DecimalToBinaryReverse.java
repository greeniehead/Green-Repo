import java.util.Scanner;

public class DecimalToBinaryReverse
{
    public static void main(String[] args)
    {
        while( 1 == 1 )
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter an integer to convert to binary: ");
            
            int num = keyboard.nextInt();
            int quotient = 1;
            int rem = 2;
            
            while(quotient != 0)
            {
                quotient = num / 2;
                rem = num % 2;
                num = quotient;
                
                if(rem == 1)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println("\nRemember this number is shown in reverse");
            System.out.println("Done");
        }
    }
}