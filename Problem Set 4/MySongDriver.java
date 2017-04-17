public class MySongDriver
{
    public static void main(String[] args)
    {
        ThisSong mySong = new ThisSong("Rob Thomas", "Unwell");
        
        System.out.println(mySong);
        
        System.out.println("Song Artist: " + mySong.getName());
        
        mySong.setName("Matchbox 20");
        
        System.out.println("Song Artist: " + mySong.getName());
    }
}