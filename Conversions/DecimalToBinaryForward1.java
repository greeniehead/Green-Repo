import java.util.Scanner;

public class DecimalToBinaryForward1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer less than or equal to 32767 to convert to binary: ");
        
        int num = keyboard.nextInt();
        int quotient = 1;
        int rem = 2;
        
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;
        int num10 = 0;
        int num11 = 0;
        int num12 = 0;
        int num13 = 0;
        int num14 = 0;
        int num15 = 0;
        
        for( int i = 0; i <= 10; i++ )
        {
            quotient = num / 2;
            rem = num % 2;
            num = quotient;
            
            if(i == 0)
            {
                if(rem == 1)
                {
                    num0 = 1;
                }
                else
                {
                    num0 = 0;
                }
            }
            else if(i == 1)
            {
                if(rem == 1)
                {
                    num1 = 1;
                }
                else
                {
                    num1 = 0;
                }
            }
            else if(i == 2)
            {
                if(rem == 1)
                {
                    num2 = 1;
                }
                else
                {
                    num2 = 0;
                }
            }
            else if(i == 3)
            {
                if(rem == 1)
                {
                    num3 = 1;
                }
                else
                {
                    num3 = 0;
                }
            }
            else if(i == 4)
            {
                if(rem == 1)
                {
                    num4 = 1;
                }
                else
                {
                    num4 = 0;
                }
            }
            else if(i == 5)
            {
                if(rem == 1)
                {
                    num5 = 1;
                }
                else
                {
                    num5 = 0;
                }
            }
            else if(i == 6)
            {
                if(rem == 1)
                {
                    num6 = 1;
                }
                else
                {
                    num6 = 0;
                }
            }
            else if(i == 7)
            {
                if(rem == 1)
                {
                    num7 = 1;
                }
                else
                {
                    num7 = 0;
                }
            }
            else if(i == 8)
            {
                if(rem == 1)
                {
                    num8 = 1;
                }
                else
                {
                    num8 = 0;
                }
            }
            else if(i == 9)
            {
                if(rem == 1)
                {
                    num9 = 1;
                }
                else
                {
                    num9 = 0;
                }
            }
            else if(i == 10)
            {
                if(rem == 1)
                {
                    num10 = 1;
                }
                else
                {
                    num10 = 0;
                }
            }
            else if(i == 11)
            {
                if(rem == 1)
                {
                    num11 = 1;
                }
                else
                {
                    num11 = 0;
                }
            }
            else if(i == 12)
            {
                if(rem == 1)
                {
                    num12 = 1;
                }
                else
                {
                    num12 = 0;
                }
            }
            else if(i == 13)
            {
                if(rem == 1)
                {
                    num13 = 1;
                }
                else
                {
                    num13 = 0;
                }
            }
            else if(i == 14)
            {
                if(rem == 1)
                {
                    num14 = 1;
                }
                else
                {
                    num14 = 0;
                }
            }
            else
            {
                if(rem == 1)
                {
                    num15 = 1;
                }
                else
                {
                    num15 = 0;
                }
            }
        }
        
        System.out.println(num10+""+num9+""+num8+""+num7+""+num6+""+num5+""+num4+""+num3+""+num2+""+num1+""+num0);
        System.out.println("Ignore the extra zeroes at the beginnning");
    }
}