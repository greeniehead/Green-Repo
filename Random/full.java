public class full
{
    public static void main()
    {
        int randRange;
        int mainRoll;
        
        for(int i = 1; i < 11; i++)
        {
            mainRoll = dice6Sides();
            
            System.out.println("#" + i + "  " + mainRoll);
        }
        
        for(int i = 1; i < 11; i++)
        {
            randRange = randomWithRange(50, 75);
            
            System.out.println("#" + i + "  " + randRange);
        }
    }
    
    public static int dice6Sides()
    {
        double rand = -1.0;
        int randomInt = -1;
        
        rand = Math.random() * 6;
        randomInt = (int)rand;
        randomInt++;
        
        return (randomInt);
    }
    
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}