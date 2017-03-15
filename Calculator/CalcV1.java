import java.util.Scanner;

public class CalcV1
{
    public static void main(String[] args)
    { 
        Scanner keyboard = new Scanner(System.in);
        
        while( 1 == 1 )
        {
            System.out.println("Select the number of the operation you want: ");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exponents");
        
            int operation = keyboard.nextInt();
            
            if( operation == 1)
            {
                System.out.println("Please enter two numbers to add: ");
                double add1 = keyboard.nextDouble();
                double add2 = keyboard.nextDouble();
                double sum = add1 + add2;
                
                System.out.println("The sum of " + add1 + " and " + add2 + " is equal to " + sum + ".");
            }
            else if( operation == 2 )
            {
                System.out.println("Please enter two numbers to subtract the second number from the first");
                double subtract1 = keyboard.nextDouble();
                double subtract2 = keyboard.nextDouble();
                double difference = subtract1 - subtract2;
                
                System.out.println("The difference between " + subtract1 + " and " + subtract2 + " is equal to " + difference + ".");
            }
            else if( operation == 3 )
            {
                System.out.println("Please enter two numbers to multiply");
                double mult1 = keyboard.nextDouble();
                double mult2 = keyboard.nextDouble();
                double product = mult1 * mult2;
            
                System.out.println("The product of " + mult1 + " and " + mult2 + " is equal to " + product + ".");
            }
            else if( operation == 4 )
            {
                System.out.println("Please enter two numbers to divide the first by the second");
                double div1 = keyboard.nextDouble();
                double div2 = keyboard.nextDouble();
                double quotient = div1 / div2;
                
                System.out.println( div1 + " Divided by " + div2 + " is equal to: " + quotient);
            }
            else if( operation == 5 )
            {
                System.out.println("Select what power you would like to put a number to: ");
                System.out.println("-3: -3");
                System.out.println("-2: -2");
                System.out.println("-1: -1");
                System.out.println("0: 0");
                System.out.println("1: 1");
                System.out.println("2: 2");
                System.out.println("3: 3");
                System.out.println("4: 4");
                System.out.println("5: 5");
                System.out.println("6: 6");
            
                int exponentSelection = keyboard.nextInt();
                
                System.out.println("Enter the number you would like to put to the power of " + exponentSelection + ".");
                double expNum = keyboard.nextDouble();
                double expAns = 0;
                
                if( expNum == 0 )
                {
                    expAns = 0;
                    System.out.println( expNum + " to the power of anything is equal to: " + expAns) ;
                }
                else if( exponentSelection == -3)
                {
                    expAns = (1 / (expNum * expNum * expNum));
                    System.out.println( expNum + " to the power of -1 is equal to: " + expAns) ;
                }
                else if( exponentSelection == -2)
                {
                    expAns = (1 / (expNum * expNum));
                    System.out.println( expNum + " to the power of -1 is equal to: " + expAns) ;
                }
                else if( exponentSelection == -1)
                {
                    expAns = 1 / expNum;
                    System.out.println( expNum + " to the power of -1 is equal to: " + expAns) ;
                }
                else if( exponentSelection == 0 )
                {
                    expAns = 1;
                    System.out.println( expNum + " to the power of 0 is equal to: " + expAns) ;
                }
                else if( exponentSelection == 1 )
                {
                    expAns = expNum;
                    System.out.println( expNum + " to the power of 1 is equal to: " + expAns);
                }
                else if( exponentSelection == 2 )
                {
                    expAns = expNum * expNum;
                    System.out.println( expNum + " to the power of 2 is equal to: " + expAns); 
                }
                else if( exponentSelection == 3 )
                {
                    expAns = expNum * expNum * expNum;
                    System.out.println( expNum + " to the power of 3 is equal to: " + expAns);
                }
                else if( exponentSelection == 4 )
                {
                    expAns = expNum * expNum * expNum * expNum;
                    System.out.println( expNum + " to the power of 4 is equal to: " + expAns);
                }
                else if( exponentSelection == 5 )
                {
                    expAns = expNum * expNum * expNum * expNum * expNum;
                    System.out.println( expNum + " to the power of 5 is equal to: " + expAns);
                }
                else if( exponentSelection == 6 )
                {
                    expAns = expNum * expNum * expNum * expNum * expNum * expNum;
                    System.out.println( expNum + " to the power of 6 is equal to: " + expAns);
                }
                else
                {
                    System.out.println("Sorry, you did not input one of the exponent options given.");
                }
            }
            else
            {
                System.out.println("Sorry, that was not a valid operation value");
            }
            System.out.println("\n");
        }
    }
}