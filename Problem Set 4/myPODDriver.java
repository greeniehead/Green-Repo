public class myPODDriver
{
    public static void main(String[] args)
    {
        String color = "Green";
        int capacity = 32;
        ThisSong song1 = new ThisSong();
        ThisSong song2 = new ThisSong("Test Artist", "Test Title");
        ThisSong song3 = new ThisSong("Test Artist2", "Test Title2", 1.23);
        
        myPOD carPod = new myPOD(color, capacity, song1, song2, song3);
        System.out.println(carPod);
    }
}