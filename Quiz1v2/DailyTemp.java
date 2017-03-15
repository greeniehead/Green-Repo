import java.util.Scanner;

public class DailyTemp
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number of days that you would like to see the forecast for: ");
        int numDays = keyboard.nextInt();
        
        int[] dates = new int[numDays];
        for(int i = 0; i < numDays; i++)
        {
            dates[i] = i + 1;
        }
        
        int[] dailyTemps = new int[numDays];
        for(int i = 0; i < numDays; i++)
        {
            dailyTemps[i] = randomWithRange(-100, 100);
        }
        
        String[] forecast = new String[numDays];
        for(int i = 0; i < numDays; i++)
        {
            if(dailyTemps[i] >= 80)
            {
                forecast[i] = "Hot";
            }
            else if((dailyTemps[i] >= 50) && (dailyTemps[i] < 80))
            {
                forecast[i] = "Moderate";
            }
            else if((dailyTemps[i] >= 32) && (dailyTemps[i] < 50))
            {
                forecast[i] = "Cold";
            }
            else
            {
                forecast[i] = "Freezing!";
            }
        }
        
        System.out.println("Date \t DailyTemperature(F) \t Forecast");
        for(int i = 0; i < numDays; i++)
        {
            System.out.println(dates[i] + " \t " + dailyTemps[i] + " \t\t\t " + forecast[i]);
        }
    }
    
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
