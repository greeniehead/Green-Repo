import java.util.Scanner;

public class Pgrm2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); //initialize scanner
        
        System.out.println("Please enter your name: "); //requesting name
        String name = keyboard.nextLine(); //name
        
        System.out.println("Please enter your address: "); //requesting address
        String address = keyboard.nextLine(); //address
        
        System.out.println("Please enter your city: "); //requesting city
        String city = keyboard.nextLine(); //city
        
        System.out.println("Please enter your state: "); //requesting state
        String state = keyboard.nextLine(); //state
        
        System.out.println("Please enter your zip code: "); //requesting zip code
        int zip = keyboard.nextInt(); //zip
        
        System.out.println(name); //print first line
        System.out.println(address); //print second line
        System.out.println(city + ", " + state + " " + zip); //print last line
        
    }
}