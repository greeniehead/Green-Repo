public class Clock
{
    private int hours;
    private int minutes;
    private int seconds;
    
    public Clock()
    {
        hours = 4;
        minutes = 37;
        seconds = 02;
    }
    
    public Clock(int newHours, int newMinutes, int newSeconds)
    {
        hours = newHours;
        minutes = newMinutes;
        seconds = newSeconds;
    }

    public String toString()
    {
        String output = new String();
        if(seconds < 10)
        {
            output = "The time is: " + hours + ":" + minutes + ":" + "0" + seconds;
        }
        else
        {
            output = "The time is: " + hours + ":" + minutes + ":" + seconds;
        }
        return output;
    }
}
