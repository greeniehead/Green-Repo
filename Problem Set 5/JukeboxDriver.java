public class JukeboxDriver
{
    public static void main(String[] args)
    {
        Jukebox juke = new Jukebox();
        System.out.println(juke);
        System.out.println("Random Song:\n" + juke.randomSong());
        int rating = 5;
        System.out.println("Song of rating " + rating + ":\n" + juke.playSongofRating(rating));
    }
}