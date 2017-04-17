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
    
    public void setTime(int newHours, int newMinutes, int newSeconds)
    {
        this.hours = newHours;
        this.minutes = newMinutes;
        this.seconds = newSeconds;
    }
    
    public void convertDaylightSavings(int hoursChange)
    {
        this.hours += hoursChange;
    }
    
    public int totalSeconds()
    {
        return ((this.hours *60*60)+(this.minutes *60) + (this.seconds));
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
            output = "The time is: " + hours + ":" + minutes + ":" + "0" + seconds + "\n" + 
                        "The total amount of seconds is: " + totalSeconds();
        }
        else
        {
            output = "The time is: " + hours + ":" + minutes + ":" + seconds + "\n" + 
                        "The total amount of seconds is: " + totalSeconds();
        }
        return output;
    }
}
