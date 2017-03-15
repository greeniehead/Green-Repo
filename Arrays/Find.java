import java.util.Scanner;

public class Find
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer to determine if it is in the array: ");
        int test = keyboard.nextInt();
        
        int[] myList = new int[]{1, 17, 36, 4, 32};
        
        boolean tf = true;
        
        for(int i = 0; i < myList.length; i++)
        {
            if(myList[i] == test)
            {
                System.out.println("The integer is in the array at index: " + i);
                tf = false;
            }
        }
        if(tf)
        {
            System.out.println("The integer is not in the array");
        }
    }
}