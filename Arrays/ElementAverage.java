import java.util.Scanner;

public class ElementAverage
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 6 numbers to average: ");
        
        double[] myList = new double[]{keyboard.nextDouble(), keyboard.nextDouble(), 
                                       keyboard.nextDouble(), keyboard.nextDouble(), 
                                       keyboard.nextDouble(), keyboard.nextDouble()};
        double x = 0;
        
        for(double element: myList)
        {
            x = x + element;
        }
        System.out.println("The average is: " + x);
    }
}