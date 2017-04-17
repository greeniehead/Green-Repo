public class Jukebox
{
    private Song[][] songList = new Song[3][4];
    public Jukebox()
    {
        songList[0][0] = new Song( "Jet Airliner", 5 );
        songList[0][1] = new Song( "Slide", 4 );
        songList[0][2] = new Song( "Tom Sawyer", 3 );
        songList[0][3] = new Song( "Purple Rain", 2 );
        songList[1][0] = new Song( "Sing a Song", 1 );
        songList[1][1] = new Song( "Baba O'Riley", 5 );
        songList[1][2] = new Song( "Jumper", 4 );
        songList[1][3] = new Song( "Car Wash", 3 );
        songList[2][0] = new Song( "Kung Fu Fighting", 2 );
        songList[2][1] = new Song( "Right as Rain", 4 );
        songList[2][2] = new Song( "Beat It", 5 );
        songList[2][3] = new Song( "Bust a Move", 4 );
    }
    
    public Song randomSong()
    {
        return songList[(int)(Math.random()*3)][(int)(Math.random()*4)];
    }
    
    public Song playSongofRating(int rating)
    {
        while(1==1)
        {
            Song testSong = songList[(int)(Math.random()*3)][(int)(Math.random()*4)];
            if(testSong.getRating() == rating)
            {
                return testSong;
            }
        }
    }
    
    public String toString()
    {
        String output = "";
        
        for(Song[] row : songList)
        {
            for(Song element : row)
            {
                output += element;
            }
            output += "\n";
        }
        return output;
    }
}