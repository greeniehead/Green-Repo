import java.util.Scanner;

public class DecimalToHex
{
    public static void main(String[] args)
    {
        while( 1 == 1 )
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter an integer to convert to hex: ");
            
            int num = keyboard.nextInt();
            int quotient = 1;
            int rem = 16;
            
            while(quotient != 0)
            {
                quotient = num / 16;
                rem = num % 16;
                num = quotient;
                
                if(rem == 0)
                {
                    System.out.println("0");
                }
                else if(rem == 1)
                {
                    System.out.println("1");
                }
                else if(rem == 2)
                {
                    System.out.println("2");
                }
                else if(rem == 3)
                {
                    System.out.println("3");
                }
                else if(rem == 4)
                {
                    System.out.println("4");
                }
                else if(rem == 5)
                {
                    System.out.println("5");
                }
                else if(rem == 6)
                {
                    System.out.println("6");
                }
                else if(rem == 7)
                {
                    System.out.println("7");
                }
                else if(rem == 8)
                {
                    System.out.println("8");
                }
                else if(rem == 9)
                {
                    System.out.println("9");
                }else if(rem == 10)
                {
                    System.out.println("A");
                }
                else if(rem == 11)
                {
                    System.out.println("B");
                }
                else if(rem == 12)
                {
                    System.out.println("C");
                }
                else if(rem == 13)
                {
                    System.out.println("D");
                }
                else if(rem == 14)
                {
                    System.out.println("E");
                }
                else if(rem == 15)
                {
                    System.out.println("F");
                }
            }
            System.out.println("\nRemember this number is shown in reverse");
            System.out.println("Done");
        }
    }
}