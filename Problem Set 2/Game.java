public class Game
{
    private String name;
    private double cost;
    private boolean multiplayer;
    public Game()
    {
        name = "Battlefield 1";
        cost = 59.99;
        multiplayer = true;
    }
    
    public Game(String newName, Boolean newMultiplayer)
    {
        name = newName;
        cost = 59.99;
        multiplayer = newMultiplayer;
    }
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + name + "\n" +
                 "Price: " + cost + "\n" +
                 "Multiplayer: ";
        
        if(multiplayer)
        {
            output = output + "yes";
        }
        else
        {
            output = output + "no";
        }
        return output;
    }
}