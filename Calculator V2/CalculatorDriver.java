import java.util.Scanner;

public class CalculatorDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean end = true;
        while(end)
        {
            double answer;
            Calculator calc = new Calculator();
            
            System.out.println("Please enter the number of the operation you wish to run:\n"+
                               "1: Addition\n"+
                               "2: Subtraction\n"+
                               "3: Multiplication\n"+
                               "4: Division\n"+
                               "5: Exponents\n"+
                               "0: Exit program");
            int operation = keyboard.nextInt();
            if(operation==1)
            {
                System.out.println("Please enter two numbers to add.");
                answer = calc.add(keyboard.nextDouble(), keyboard.nextDouble());
                System.out.println("The sum is: " + answer);
            }
            else if(operation==2)
            {
                System.out.println("Please enter two numbers to subtract the second from the first.");
                answer = calc.subtract(keyboard.nextDouble(), keyboard.nextDouble());
                System.out.println("The difference is: " + answer);
            }
            else if(operation==3)
            {
                System.out.println("Please enter two numbers to multiply.");
                answer = calc.multiply(keyboard.nextDouble(), keyboard.nextDouble());
                System.out.println("The product is: " + answer);
            }
            else if(operation==4)
            {
                System.out.println("Please enter two numbers to divide the first by the second.");
                answer = calc.divide(keyboard.nextDouble(), keyboard.nextDouble());
                System.out.println("The quotient is: " + answer);
            }
            else if(operation==5)
            {
                
                System.out.println("Please enter two numbers to put the first to the power of the second.");
                answer = calc.exponent(keyboard.nextDouble(), keyboard.nextInt());
                System.out.println("The answer is is: " + answer);
                
                //System.out.println("Work In Progress");
            }
            else if(operation==0)
            {
                end = false;
            }
            else
            {
                System.out.println("Incorrect operation number, try again.");
            }
        }
        System.out.println("End.");
    }
}