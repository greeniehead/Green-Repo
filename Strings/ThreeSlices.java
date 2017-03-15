public class ThreeSlices
{
    public static void main(String[] args)
    {
        String full = "startmiddleend";
        String start = full.substring(0,5);
        String middle = full.substring(5,11);
        String end = full.substring(11);
        
        System.out.println(full + "\n" + start + "\n" + middle + "\n" + end);
    }
}