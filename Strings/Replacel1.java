public class Replacel1
{
    public static void main(String[] args)
    {
        String full = "She sells sea shells.";
        String less;
        
        char[] stringToArray = full.toCharArray();
        for(char element : stringToArray)
        {
            if(element == 'l')
            {
                element = '1';
                System.out.print(element);
            }
            else
            {
                System.out.print(element);
            }
        }
    }
}