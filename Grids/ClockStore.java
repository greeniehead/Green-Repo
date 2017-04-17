public class ClockStore
{
    private Clock[] clocksInStock = new Clock[3];
    private static int numClocks = 0;
    public ClockStore()
    {
        Clock clock1 = new Clock(12,30,45);
        numClocks++;
        Clock clock2 = new Clock();
        numClocks++;
        Clock clock3 = new Clock(13, 18, 37);
        numClocks++;
        clocksInStock[0] = clock1;
        clocksInStock[1] = clock2;
        clocksInStock[2] = clock3;
    }
    public int mostSeconds()
    {
        int seconds1 = clocksInStock[0].totalSeconds();
        int seconds2 = clocksInStock[1].totalSeconds();
        int seconds3 = clocksInStock[2].totalSeconds();
        int most = 0;
        
        if(seconds1 < seconds2)
        {
            most = 1;
            if(seconds2 < seconds3)
            {
                most = 2;
            }
        }
        else if(seconds1 < seconds3)
        {
            most = 2;
        }
        return most;
    }
    public String toString()
    {
        String output = "";
        for(Clock element : clocksInStock)
        {
            output += "Clock: " + element + "\n";
        }
        output += "Number of clocks: " + numClocks;
        return output;
    }
}