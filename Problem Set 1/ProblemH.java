public class ProblemH
{
    public static void main(String[] args)
    {
        String[] musicalArtists = {"Someone", "Someone Else", "Example1"};
        for(String element : musicalArtists)
        {
            System.out.println(element);
        }
        System.out.println();
        
        int newIndex = (int)(Math.random() * 3);
        musicalArtists[newIndex] = "Michael Jackson";
        for(String element : musicalArtists)
        {
            System.out.println(element);
        }
        System.out.println();
        
        for(int index = 0; index < musicalArtists.length; index++)
        {
            if(musicalArtists[index] == "Michael Jackson")
            {
                System.out.println("Michael is at index: " + index + ".");
            }
            else
            {
                System.out.println("Mchael is not at index: " + index + ".");
            }
        }
    }
}