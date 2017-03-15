public class RemoveSpaces
{
    public static void main(String[] args)
    {
        String full = "This is a test 1 2 3.";
        
        char[] stringToArray = full.toCharArray();
        for(char element : stringToArray)
        {
            if(element == ' ')
            {
            }
            else
            {
                System.out.print(element);
            }
        }
    }
}