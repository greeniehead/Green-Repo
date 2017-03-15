import java.util.Scanner;

public class P2DMyChoiceDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        Game myGame = new Game();
        System.out.println(myGame);
        
        System.out.println("Please enter the name of the game and true if it has multiplayer and false if it doesn't.");
        Game myGame2 = new Game(keyboard.next(), keyboard.nextBoolean());
        System.out.println(myGame2);
    }
}