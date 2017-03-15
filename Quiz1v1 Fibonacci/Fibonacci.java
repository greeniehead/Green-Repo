import java.util.Scanner; //importing scanner

public class Fibonacci
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in); //declaring scanner
        System.out.println("Please enter the number of Fibonacci numbers you would like to see(must be 2 or greater): "); //asking for value
        int numFib = keyboard.nextInt(); //obtaining value
        
        int tempSum = 0; //sum used to calc each next fib#
        
        int[] fibSums = new int[numFib]; //declaring the array to calculate running total of fib numbers and first 2 sums
        fibSums[0] = 0;
        fibSums[1] = 1;
        
        int[] numbers = new int[numFib]; //declaring number array
        int counter = 0; //declaring counter for the index of the numbers in the numbers array
        for(int i = 1; i <= numFib; i++) //for loop #1
        {
            numbers[counter] = i;
            counter++;
        }
        
        int[] fibonacci = new int[numFib]; //declaring fibonacci array and first 2 numbers
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int index = 2; index < numFib; index++) //for loop #2
        {
            fibonacci[index] = (fibonacci[index - 1]) + (fibonacci[index - 2]); //adding to fib series
            fibSums[index] = fibSums[index - 1] + fibonacci[index]; //adding to running sum
        }
        
        System.out.println("Number\tFibonacci Number\tRunning Total of FNs"); //titles
        for(int finalIndex = 0; finalIndex < numFib; finalIndex++) //for loop #3
        {
            System.out.println(numbers[finalIndex] + "\t" + fibonacci[finalIndex] + "\t\t\t" + fibSums[finalIndex]);
        }                            //printing out the values
    }
}