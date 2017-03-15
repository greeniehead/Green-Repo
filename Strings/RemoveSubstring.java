public class RemoveSubstring
{
    public static void main(String[] args)
    {
        String full = "Elm Cypress Oak Palm";
        String start = full.substring(0,12);
        String end = full.substring(16);
        
        System.out.println(start + end);
    }
}