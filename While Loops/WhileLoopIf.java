import java.util.Scanner;

public class WhileLoopIf
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int x = 1;
        
        while(x % 7 != 0)
        {
            System.out.println("Enter an integer divisible by 7: ");
            x = keyboard.nextInt();
            
            if(x % 7 != 0)
            {
                System.out.println("The integer, " + x + ", was not divisible by 7");
            }
        }
        
        System.out.println( x + " Is divisible by 7");
    }
}