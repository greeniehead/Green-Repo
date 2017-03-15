public class EvenMonths
{
    public static void main(String[] args)
    {
        String[] monthsList = new String[]{"jan", "feb", "mar", "apr", "may", "june", "july", "aug", "sep", "oct", "nov", "dec"};
        
        System.out.println("All months:");
        for(String element: monthsList)
        {
            System.out.println(element);
        }
        System.out.println("\nEven months:");
        for(int i = 1; i <= 12; i = i + 2)
        {
            System.out.println(monthsList[i]);
        }
    }
}