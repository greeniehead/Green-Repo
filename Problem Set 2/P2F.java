public class P2F
{
    public static void main(String[] args)
    {
        double tempMax;
        double max = -1;
        
        double[] avgs = new double[9];
        for(int i = 0; i < 9; i++)
        {
            avgs[i] = Math.random() * .5;
        }
        
        for(double element : avgs)
        {
            System.out.println(element);
        }
        
        for(int i = 0; i < 8; i++)
        {
            
            if(maxFunction(i, i+1) == avgs[i])
            {
                tempMax = avgs[i];
            }
            else
            {
                tempMax = avgs[i+1];
            }
            
            if(tempMax > max)
            {
                max = tempMax;
            }
        }
        System.out.println(max);
    }
    
    public static double maxFunction(double n1, double n2)
    {
        double min;
        if(n1 > n2)
        {
            min = n1;
        }
        else
        {
            min = n2;
        }
        return min;
    }
}