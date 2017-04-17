public class myPOD
{
    private String color;
    private int capacity;
    private ThisSong[] songLibrary = new ThisSong[3];
    
    public myPOD()
    {
        color = "Bright Green";
        capacity = 9999999;
        
    }
    public myPOD(String myColor, int myCapacity, ThisSong song1, ThisSong song2, ThisSong song3)
    {
        color = myColor;
        capacity = myCapacity;
        songLibrary[0] = song1;
        songLibrary[1] = song2;
        songLibrary[2] = song3;
    }
    
    public String toString()
    {
        String songList = "";
        int index = 0;
        for(ThisSong element : songLibrary)
        {
            index++;
            songList += element;
            if(index == songLibrary.length)
            {
            }
            else
            {
                songList += ", ";
            }
        }
        String podInfo = new String();
        podInfo = ("Color: " + this.color + "\n"+
                   "Capacity in GB: " + this.capacity + "\n"+
                   "Songs: " + songList);
        
        return podInfo;
    }
}