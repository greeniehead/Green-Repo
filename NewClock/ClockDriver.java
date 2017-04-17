import java.util.Scanner;

public class ClockDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        
        System.out.println("Please enter the hours, minutes, and seconds.");
        Clock bedroomClock = new Clock(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt());
        System.out.println(bedroomClock);
        
        Clock testClock = new Clock();
        System.out.println(testClock);
        
        testClock.setTime(7, 43, 18);
        System.out.println(testClock);
        
        testClock.convertDaylightSavings(-1);
        System.out.println(testClock);
        
        System.out.println(testClock.totalSeconds());
    }
}