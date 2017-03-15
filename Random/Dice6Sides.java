public class Dice6Sides
{
    
    public static void main()
    {
        int mainRoll = -1;
        
        for(int i = 1; i < 11; i++)
        {
            mainRoll = randInt();
            
            System.out.println("#" + i + "  " + mainRoll);
        }
    }
    
    public static int randInt()
    {
        double rand = -1.0;
        int randomInt = -1;
        
        rand = Math.random() * 6;
        randomInt = (int)rand;
        randomInt++;
        
        return (randomInt);
    }
}
