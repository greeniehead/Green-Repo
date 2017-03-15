public class ProblemE
{
    public static void main(String[] args)
    {
        String movie1 = "Something";
        String movie2 = "Something else";
        String movie3 = "A Third Thing";
        String song1 = "Guess what";
        String song2 = "I Still have";
        String song3 = "NOTHING";
        int counter = 0;
        
        String[] moviesList = new String[]{movie1, movie2, movie3};
        String[] songsList = new String[]{song1, song2, song3};
        
        for(String element : moviesList)
        {
            System.out.println(element);
        }
        System.out.println("\n");
        while(counter < songsList.length)
        {
            System.out.print(songsList[counter]);
            if(counter < 2)
            {
                System.out.print(", ");
            }
            counter++;
        }
    }
}