import java.util.Scanner; //get scanner

public class Pgrm3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); //initialize scanner
        
        System.out.println("Please enter the length: "); //asking for length
        int length = keyboard.nextInt(); //creating length
        
        System.out.println("Please enter the width: "); //asking for width
        int width = keyboard.nextInt(); //creating width
        
        System.out.println("Please enter the height: "); //asking for height
        int height = keyboard.nextInt(); //creating height
        
        int surfaceArea = 2 * (( length * width ) + ( length * height ) + ( width * height ));
        //creating surface area variable and calculating it's value
        
        System.out.println("The surface area of your rectangular prism is " + surfaceArea);
    }
}