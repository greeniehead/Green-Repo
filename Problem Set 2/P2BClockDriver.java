import java.util.Scanner;

public class P2BClockDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        
        System.out.println("Please enter the hours, minutes, and seconds.");
        Clock bedroomClock = new Clock(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt());
        System.out.println(bedroomClock);
    }
}