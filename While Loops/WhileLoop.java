import java.util.Scanner;

public class WhileLoop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter an Integer divisible by 7: ");
        int x = keyboard.nextInt();
        
        while(x % 7 != 0)
        {
            System.out.println(x + " Is not divisible by 7. \nTry again");
            x = keyboard.nextInt();
            
        }
        
        System.out.println("Congrats, " + x + " is divisible by 7.");
    }
}