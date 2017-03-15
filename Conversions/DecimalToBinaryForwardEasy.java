import java.util.Scanner;
import java.lang.*;

public class DecimalToBinaryForwardEasy
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter an integer to convert to binary: ");
        int num = keyboard.nextInt();
        
        System.out.println(Integer.toBinaryString(num));
    }
}