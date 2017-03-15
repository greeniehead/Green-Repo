public class randomRange
{
    public static void main()
    {
        int randomRange;
        
        for(int i = 0; i < 10; i++)
        {
            randomRange = randomWithRange(50, 75);
            
            System.out.println(randomRange);
        }
    }
    
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
