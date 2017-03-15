public class OpenToCloseBracket
{
    public static void main(String[] args)
    {
        char open = '[';
        
        int close = (int)open + 2;
        System.out.println("Open: " + open + "   Close: " + (char)close);
    }
}