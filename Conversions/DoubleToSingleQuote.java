public class DoubleToSingleQuote
{
    public static void main(String[] args)
    {
        char quote = '\"';
        
        int doubleQuote = (int)quote + 5;
        
        System.out.println("Double: " + quote + "   Single: " + (char)doubleQuote);
    }
}