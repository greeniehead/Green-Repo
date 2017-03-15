import java.util.Scanner;

public class DecimalToBinaryArray
{
    public static void main(String[] args)
    {
        while(1 == 1)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter an integer to convert to binary:");
            
            int[] forward = new int[20];
            int num = keyboard.nextInt();
            int quotient = 1;
            int rem = 2;
            int listIndex = 0;
            
            while(quotient != 0)
            {
                quotient = num / 2;
                rem = num % 2;
                num = quotient;
                
                if(rem == 1)
                {
                    forward[listIndex++] = 1;
                }
                else
                {
                    forward[listIndex++] = 0;
                }
            }
            for(int element: forward)
            {
                System.out.print(element);
            }
            System.out.println("\nDone.");
        }
    }
}