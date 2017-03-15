public class Song
{
    private String name;
    private String title;
    private double cost;
    private int length;
    private int minutes;
    private int seconds;
    private String simpleLength;
    
    public Song()   //This is a "zero argument" constructor...it takes no arguments!
    {
        name = "Rob Thomas";
        title = "Unwell";
        cost = 0.99;
        length = 187;
    }
    
    public int getLength()
    {
        return this.length;
    }
    
    public String getSimplifiedLength(int length)
    {
        seconds = length % 60;
        minutes = length / 60;
        simpleLength = "The song is " + minutes + " minutes and " + seconds + " seconds long.";
        return simpleLength;
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }
    
    public String toString()
    {
        String output = new String();
        
        output = "Artist is " + name + "\n" +
                 "Title is " + title + "\n" +
                 "Cost is " + cost + "\n" +
                 getSimplifiedLength(length);
                 
        return output;
        
    }
}
