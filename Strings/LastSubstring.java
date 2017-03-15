public class LastSubstring
{
    public static void main(String[] args)
    {
        String full = "Duck Duck Goose Duck Swan";
        for(int i = full.length(); i >= 0; i--)
        {
            if(full.substring(i-4, i).equals("Duck"))
            {
                System.out.println("The last occurrence of \"Duck\" is at index " + (i-4) + ".");
                i = -1;
            }
        }
    }
}